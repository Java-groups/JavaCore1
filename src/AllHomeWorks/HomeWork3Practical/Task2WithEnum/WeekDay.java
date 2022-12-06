package AllHomeWorks.HomeWork3Practical.Task2WithEnum;

public enum WeekDay {
    Monday("Asia", "Понеділок"),
    Tuesday("Africa", "Вівторок"),
    Wednesday("Europe", "Середа"),
    Thursday("NorthAmerica","Четвер"),
    Friday("SouthAmerica", "П'ятниця"),
    Saturday("Australia", "Субота"),
    Sunday("Antarctica", "Неділя");
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
