package HM3.PracticalTasks.PracticalTask2;

public class WeekDay {
    int dayNumber;
    String dayNameEn;
    String dayNameUa;

    public String getDayNameEn() {
        return dayNameEn;
    }

    public String getDayNameUa() {
        return dayNameUa;
    }

    WeekDay (int dayNumber, String dayNameEn, String dayNameUa) {
        this.dayNumber = dayNumber;
        this.dayNameEn = dayNameEn;
        this.dayNameUa = dayNameUa;
    }
}
