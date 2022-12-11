package HW3.com.model;

public enum DayOfWeek {
    MONDAY("monday","понеділок"),
    TUESDAY("tuesday", "вівторок"),
    WEDNESDAY("wednesday", "середа"),
    THURSDAY("thursday", "четверг"),
    FRIDAY("friday", "п'ятниця"),
    SATURDAY("saturday", "субота"),
    SUNDAY("sunday", "неділя");
    private String ua;
    private String en;

    DayOfWeek(String en, String ua) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return  "ua='" + ua + '\'' +
                ", en='" + en + '\'';
    }

}
