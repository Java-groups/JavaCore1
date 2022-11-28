import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Country[] countryArray = new Country[3];

        for(int i = 0; i < countryArray.length; i++) {
            countryArray[i] = new Country();
            System.out.println("Please enter price per minute for "+(i+1)+" country");
            countryArray[i].setPricePerMinute(Integer.parseInt(br.readLine()));
            System.out.println("Please enter amount of minutes for "+(i+1)+" country");
            countryArray[i].setAmountOfMinutes(Integer.parseInt(br.readLine()));
        }

        double totalCalls = 0;
        for(int i = 0; i < countryArray.length; i++) {
            System.out.println("Call for "+i+" country: "+countryArray[i].getCallAmount());
            totalCalls += countryArray[i].getCallAmount();
        }

        System.out.println("Total: "+totalCalls);
    }}