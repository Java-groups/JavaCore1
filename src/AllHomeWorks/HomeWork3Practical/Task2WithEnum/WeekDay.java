package AllHomeWorks.HomeWork3Practical.Task2WithEnum;

public enum WeekDay {
    Monday("Monday", "Понеділок"),
    Tuesday("Tuesday", "Вівторок"),
    Wednesday("Wednesday", "Середа"),
    Thursday("Thursday","Четвер"),
    Friday("Friday", "П'ятниця"),
    Saturday("Saturday", "Субота"),
    Sunday("Sunday", "Неділя");
    private final String ua;
    private final String en;

    WeekDay(String en, String ua) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }
}
