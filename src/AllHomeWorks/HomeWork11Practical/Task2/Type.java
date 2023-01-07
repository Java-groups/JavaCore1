package AllHomeWorks.HomeWork11Practical.Task2;

public enum Type {
    Chamomile("chamomile"),
    Rose("rose"),
    Tulip("tulip"),
    Knapweed("knapweed"),
    Anemone("anemone");

    private final String typePlant;


    Type(String typePlant) {
        this.typePlant = typePlant;
    }

    public String getType() {
        return typePlant;
    }
}
