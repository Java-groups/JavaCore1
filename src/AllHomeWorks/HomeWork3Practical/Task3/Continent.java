package AllHomeWorks.HomeWork3Practical.Task3;

public enum Continent {
    Asia("Asia", ",China,Asia,"),
    Africa("Africa", ",Africa,Egypt,"),
    Europe("Europe", ",Ukraine,Italy,Spain,France,"),
    NorthAmerica("North America",",USA,Canada,"),
    SouthAmerica("South America", ",Brazil,"),
    Australia("Australia", ",Australia,"),
    Antarctica("Antarctica", ",Antarctica,");
    private final String continent;
    private final String country;


    Continent(String continent, String country) {
        this.continent = continent;
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }
}
