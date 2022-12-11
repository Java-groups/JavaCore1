package arthurmkrtchian.javaCore.conditionStatements.practicalTasks.practicalTask3;

public enum Continents {
    ASIA("Asia"),
    AFRICA("Africa"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    ANTARCTICA("Antarctica"),
    EUROPE("Europe"),
    AUSTRALIA("Australia");

    String continent;

    Continents(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return  continent;
    }
}
