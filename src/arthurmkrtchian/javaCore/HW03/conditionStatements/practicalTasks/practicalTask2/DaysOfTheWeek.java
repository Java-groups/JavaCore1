package arthurmkrtchian.javaCore.HW03.conditionStatements.practicalTasks.practicalTask2;

public enum DaysOfTheWeek {
    MONDAY("Monday","Понеділок"),
    TUESDAY("Tuesday","Вівторок"),
    WEDNESDAY("Wednesday","Середа"),
    THURSDAY("Thursday","Четверг"),
    FRIDAY("Friday","П'ятниця"),
    SATURDAY("Saturday","Субота"),
    SUNDAY("Sunday","Неділя");

    private String en;
    private String ua;

    DaysOfTheWeek(String en, String ua) {
        this.ua = ua;
        this.en = en;
    }

    @Override
    public String toString() {
        return "On Ukrainian: " + ua
                + "\nOn English: " + en;
    }
}
