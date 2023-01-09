package HW12.model;

public class Seasons {
    private String season;


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Seasons(String season) {
        this.season = season;
    }

    public static int compareByName(Seasons a, Seasons b) {
        return a.season.compareTo(b.season);
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "season='" + season + '\'' +
                '}';
    }
}
