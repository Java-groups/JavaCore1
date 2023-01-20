package arthurmkrtchian.javaCore.HW15.IOStreamsDebugging.homeWorks.homeWork2;

//        2. A file with java code is given. Read program text from file and all words public in the
//        declaration of class attributes and methods should be replaced with the word private.
//        Save the result to another previously created file.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        random.ints(0,10).distinct().limit(10).sorted().forEach(System.out::println);


    }

    public final class EX{
        final static int x = 0;
    }

    public class CL{
        EX ex = new EX();
    }


}
