package arthurmkrtchian.javaCore.HW09.collections2.practicalTasks.practicalTask;

public enum Names {
    LIAM("Liam"),
    OLIVIA("Olivia"),
    NOAH("Noah"),
    EMMA("Ema"),
    OLIVER("Oliver"),
    CHARLOTTE("Charlotte"),
    ELAIJAH("Elaijah"),
    AMELIA("Amelia"),
    WILLIAM("William"),
    SOPHIA("Sophia"),
    BENJAMIN("Benjamin"),
    ISABELLA("Isabella"),
    LUCASs("Lucas"),
    JAMES("James"),
    AVA("Ava"),
    MIA("Mia");

    String value;

    Names(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
