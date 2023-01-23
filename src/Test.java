import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int option = 0;
        do {
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:


                case 2:
                    while (option != 3) ;

            }
        } while (option!=15);
    }
}
