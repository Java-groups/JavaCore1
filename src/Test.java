import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int option = 0;
        do {
            System.out.println("Enter task number:");
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:


                case 2:
                case 3:
                    System.out.println("1 dollar costs 40 hryvnias");
                    System.out.println("Enter amount of dollars:");
                    double dollars = Integer.parseInt(br.readLine());
                    double hryvnias = dollars*40;
                    System.out.println("It is " + hryvnias + " hryvnias");
                    while (option != 3) ;

            }
        } while (option != 15);
    }
}
