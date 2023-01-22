package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
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
        }
    }

    private void handlerMessage(Message message) throws TelegramApiException {
        if (message.hasText()) {
            Optional<MessageEntity> command = message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();
            if (command.isPresent()) {
                if (message.getText().equals("/start")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(message.getChatId().toString());
                    sendMessage.setText("Hello! \n " +
                            "My name is EveryDayBot \n");
                    execute(sendMessage);
                } else if (message.getText().equals("/tracker")) {
                    LocalDateTime time = LocalDateTime.now(ZoneId.of("Europe/Kiev"));
                    Map<DayOfWeek, String> someMap = new HashMap<>();
                    someMap.put(DayOfWeek.MONDAY, "06-10,15-19,21-23");
                    someMap.put(DayOfWeek.TUESDAY, "00-04,09-13,18-22");
                    someMap.put(DayOfWeek.WEDNESDAY, "03-07,12-16,21-00");
                    someMap.put(DayOfWeek.THURSDAY, "00-01,06-10,15-19");
                    someMap.put(DayOfWeek.FRIDAY, "00-04,09-13,19-22");
                    someMap.put(DayOfWeek.SATURDAY, "03-07,14-16,23-02");
                    someMap.put(DayOfWeek.SUNDAY, "00-01,06-10,16-19");
                    if(tester(someMap,time)){
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

                }
            }
        } else if (message.getText().equals("/pomodoro")) {
            String value = message.getText();
            if (value != null) {

            }
        } else if (message.getText().equals("/schedule")) {

        }
    }
    private boolean tester(Map<DayOfWeek, String> someMap,LocalDateTime time) {
        int result, second, third;
        for (Map.Entry<DayOfWeek, String> m : someMap.entrySet()) {
            if (m.getKey().equals(time.getDayOfWeek())) {
                String dates = m.getValue().replaceAll(",", " ");
                String[] splitter = dates.split(" ");
                for (int i = 0; i < splitter.length; i++) {
                    System.out.println(splitter[i] + " ");
                    String last = splitter[splitter.length - 1];
                    second = Integer.parseInt(splitter[i].substring(3, 5));
                    ArrayList<String> strings = new ArrayList<>();
                    for (int k = 0; k < splitter.length; k++) {
                        strings.add(splitter[k]);
                    }

                    for (String s : strings) {
                        if (last.equals(s)) {
                            third = Integer.parseInt(strings.get(i).substring(0, 2));
                        } else third = Integer.parseInt(strings.get(i + 1).substring(0, 2));
                        if (second > third) {
                            result = second - third;
                        } else result = third - second;
                        for (int c = 0; c < result;) {
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
