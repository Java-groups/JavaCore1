package org.project;

import org.project.Schedule.Schedule;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.*;
import java.util.*;

public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return System.getenv("BOT_NAME");
    }

    @Override
    public String getBotToken() {
        return System.getenv("BOT_TOKEN");
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                try {
                    handlerMessage(update.getMessage());
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();
            for (Schedule s : Schedule.values()) {
                if (call_data.equals("DATE_SCHEDULE" + s.name()))
                    try {
                        execute(SendMessage
                                .builder()
                                .text("Графік на " + s.name() + "\n " + s.getSchedule())
                                .chatId(chat_id)
                                .build());
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }


    private void handlerMessage(Message message) throws TelegramApiException {
        if (message.hasText()) {
            Optional<MessageEntity> command = message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();
            if (command.isPresent()) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(message.getChatId().toString());
                sendMessage.setText(message.getText());
                ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboardButtons = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("/start");
                row.add("/tracker");
                keyboardButtons.add(row);
                row = new KeyboardRow();
                row.add("/schedule");
                row.add("/pomodoro");
                keyboardButtons.add(row);
                replyKeyboard.setKeyboard(keyboardButtons);
                sendMessage.setReplyMarkup(replyKeyboard);

                if (message.getText().equals("/start")) {
                    execute(SendMessage
                            .builder()
                            .text("Hi! \n My name is EBot(EDaily Bot) \uD83E\uDD79")
                            .chatId(message.getChatId())
                            .build());
                } else if (message.getText().equals("/tracker")) {
                    LocalDateTime time = LocalDateTime.now(ZoneId.of("Europe/Kiev"));
                    if (trackerSchedule(time)) {
                        execute(SendMessage
                                .builder()
                                .chatId(message.getChatId().toString())
                                .text("Світло є :)")
                                .build());
                    } else {
                        execute(SendMessage
                                .builder()
                                .chatId(message.getChatId().toString())
                                .text("Світла нема :(")
                                .build());
                    }

                } else if (message.getText().equals("/schedule")) {
                    if (message.hasText()) {
                        List<List<InlineKeyboardButton>> button = new ArrayList<>();
                        for (Schedule schedule : Schedule.values()) {
                            button.add(Arrays.asList(
                                    InlineKeyboardButton
                                            .builder()
                                            .text(schedule.name())
                                            .callbackData("DATE_SCHEDULE" + schedule.name())
                                            .build()
                            ));
                        }
                        execute(SendMessage.builder()
                                .chatId(message.getChatId())
                                .text("Виберіть день : ")
                                .replyMarkup(InlineKeyboardMarkup.builder().keyboard(button).build())
                                .build());
                    }
                } else if (message.getText().equals("/pomodoro")) {
                    List<List<InlineKeyboardButton>> button = new ArrayList<>();
                    button.add(Arrays.asList(
                            InlineKeyboardButton
                                    .builder()
                                    .text("15 mitutes")
                                    .callbackData("Start")
                                    .build(),
                            InlineKeyboardButton
                                    .builder()
                                    .text("5 minutes")
                                    .callbackData("Stop")
                                    .build()
                    ));
                    execute(SendMessage
                            .builder()
                            .text("Виберіть час : ")
                            .replyMarkup(InlineKeyboardMarkup.builder().keyboard(button).build())
                            .chatId(message.getChatId())
                            .build());

                }

            }
        }
    }

    private boolean trackerSchedule(LocalDateTime time) {
        int result;
        int secondElement;
        int thirdElement;
        for (Schedule schedule : Schedule.values()) {
            if (schedule.name().equals(time.getDayOfWeek().toString())) {
                String dates = schedule.getSchedule().replaceAll(",", " ");
                String[] splitter = dates.split(" ");
                for (int i = 0; i < splitter.length; i++) {
                    System.out.println(splitter[i] + " ");
                    String last = splitter[splitter.length - 1];
                    secondElement = Integer.parseInt(splitter[i].substring(3, 5));
                    ArrayList<String> strings = new ArrayList<>();
                    for (int k = 0; k < splitter.length; k++) {
                        strings.add(splitter[k]);
                    }
                    for (String s : strings) {
                        if (last.equals(s)) {
                            thirdElement = Integer.parseInt(strings.get(i).substring(0, 2));
                        } else thirdElement = Integer.parseInt(strings.get(i + 1).substring(0, 2));
                        if (secondElement > thirdElement) {
                            result = secondElement - thirdElement;
                        } else result = thirdElement - secondElement;
                        for (int c = 0; c < result; ) {
                            if (strings.get(i).substring(0, 2).equals(Integer.toString(time.getHour())) ||
                                    strings.get(i).substring(0, 2).equals(Integer.toString(time.plusHours(c).getHour()))) {
                                return false;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
