package org.project.Schedule;


public enum Schedule {
    MONDAY("06-10,15-19,21-23"),
    TUESDAY("00-04,09-13,18-22"),
    WEDNESDAY("03-07,12-16,21-00"),
    THURSDAY("00-01,06-10,15-19"),
    FRIDAY("00-04,09-13,19-22"),
    SATURDAY("03-07,14-16,23-02"),
    SUNDAY("00-01,06-10,16-19");


    private String schedule;

    Schedule(String schedule) {
     this.schedule = schedule;
    }
    public String getSchedule() {
        return schedule;
    }
}
