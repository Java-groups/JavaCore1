import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("What's your name?");
        Scanner in_nameAdr = new Scanner(System.in);
        String name = in_nameAdr.nextLine();
        if(name.isEmpty())
        {
            System.out.println("You don't write your name.");
        }
        else {
            System.out.println("Where are you live? - " + name);
        }

        String adr = in_nameAdr.nextLine();
        if(adr.isEmpty())
        {
            System.out.println("You don't write your adress.");
        }
        else {
            System.out.println("Your name - " + name);
            System.out.println("You live in - " + adr);
        }


    }
}