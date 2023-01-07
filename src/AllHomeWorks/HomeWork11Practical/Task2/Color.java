package AllHomeWorks.HomeWork11Practical.Task2;

public enum Color {
    Yellow("Yellow"),
    Green("Green"),
    Blue("Blue"),
    Black("Black"),
    Brown("Brown"),
    Red("Red"),
    Violet("Violet");

    private final String col;


    Color(String col) {
        this.col = col;
    }

    public String getColor() {
        return col;
    }

}
