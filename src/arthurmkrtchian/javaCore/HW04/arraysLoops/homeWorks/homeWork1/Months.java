package arthurmkrtchian.javaCore.HW04.arraysLoops.homeWorks.homeWork1;

public enum Months {
    JANUARY("January"), FEBRUARY("February"),
    MARCH("March"), APRIL("April"), MAY("May"),
    JUNE("June"), JULY("July"), AUGUST("August"),
    SEPTEMBER("September"), OCTOBER("October"), NOVEMBER("November"),
    DECEMBER("December");

    String name;

    Months(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
