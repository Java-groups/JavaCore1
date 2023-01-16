package arthurmkrtchian.javaCore.HW03.conditionStatements.homeWorks.homeWork2;

public enum Breed {

    ESKIMO("Eskimo Dog"),
    MALAMUTE("Alaskan Malamute"),
    AKITA("Akita"),
    FOXHOUND("Foxhound"),
    AZAWAKH("Azawakh"),
    POOCH("Pooch");

    String bread;

    Breed(String s) {
        this.bread = s;
    }

    @Override
    public String toString() {
        return bread;
    }
}
