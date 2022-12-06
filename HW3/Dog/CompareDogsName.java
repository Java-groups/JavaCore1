import static java.lang.System.out;

public class CompareDogsName {
    private boolean state = false;

    public void compare(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (dogs[i].equals(dogs[j]) && dogs[i] != dogs[j]) {
                    out.println("dog with hashcode: "
                            + dogs[i].hashCode()
                            + " has the same name as dog with hashcode: "
                            + dogs[j].hashCode());
                    state = true;
                }
            }
        }
        if (!state) out.println("there are no dogs with the same name");
    }
}
