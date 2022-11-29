import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //Flower bed task
//        System.out.println("Please enter a radius");
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextInt();
//        double pi = 3.1416;
//        System.out.println("This is the perimeter " + (2*pi*r));
//        System.out.println("This is the area " + (pi*r*r));

        //"Where do you live" task
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name = sc.next();
//        System.out.println("Where do you live,"+name+"?");
//        String address = sc.next();
//        System.out.println(name+" lives at "+address);

        //Calls from abroad
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Define the price per min for Germany (in USD)");
        int GermanyPrice = Integer.parseInt(br.readLine());
        System.out.println("How long did you talk (in min)?");
        int GermanyCallDuration = Integer.parseInt(br.readLine());
        System.out.println("Your call costed " + (GermanyPrice*GermanyCallDuration)+" USD\n");

        System.out.println("Define the price per min for Poland (in USD)");
        int PolandPrice = Integer.parseInt(br.readLine());
        System.out.println("How long did you talk (in min)?");
        int PolandCallDuration = Integer.parseInt(br.readLine());
        System.out.println("Your call costed " + (PolandPrice*PolandCallDuration)+" USD\n");

        System.out.println("Define the price per min for Spain (in USD)");
        int SpainPrice = Integer.parseInt(br.readLine());
        System.out.println("How long did you talk (in min)?");
        int SpainCallDuration = Integer.parseInt(br.readLine());
        System.out.println("Your call costed " + (SpainPrice*SpainCallDuration)+" USD\n");

        System.out.println("All your calls costed (in USD)" + ((PolandPrice*PolandCallDuration)+(SpainPrice*SpainCallDuration)+(GermanyPrice*GermanyCallDuration))+" USD");

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("How are you?");
//        String name = br.readLine();
//        System.out.println("You are " + name);


//        int a, b;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Please define variable a");
//        a = Integer.parseInt(br.readLine());
//        System.out.println("Please define variable b");
//        b = Integer.parseInt(br.readLine());
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(((double)a)/b);

    }
}