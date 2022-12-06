public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Zefir", 2, Breed.AMERICAN_ESKIMO);
        dogs[1] = new Dog("Chappi", 3, Breed.AUSTRALIAN_TERRIER);
        dogs[2] = new Dog("Keks", 4, Breed.BICHON_FRISE);

        CompareDogsName cdn = new CompareDogsName();
        cdn.compare(dogs);

        OldestDogFinder odf = new OldestDogFinder();
        odf.find(dogs);
    }
}