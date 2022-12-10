package AllHomeWorks.Homework4.Task1;

public enum Months {
    January(1,"January", "31"),
    February(2,"February", "28"),
    March(3,"March", "31"),
    April(4,"April", "30"),
    May(5,"May", "31"),
    June(6,"June", "30"),
    July(7,"July", "31"),
    August(8,"August", "31"),
    September(9,"September", "30"),
    October(10,"October", "31"),
    November(11,"November", "30"),
    December(12,"December", "31");

    private final int monthNumber;
    private final String month;
    private final String day;

    Months(int monthNumber, String month, String day){
        this.monthNumber = monthNumber;
        this.month = month;
        this.day = day;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
    public String getDay() {
        return day;

    }

    public String getMonth() {
        return month;
    }
}
