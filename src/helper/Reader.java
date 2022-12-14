package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public float readFloat(String wrongInputMessage) throws IOException {
        return Float.parseFloat(read(wrongInputMessage, DataTypes.FLOAT));
    }

    public int readInteger(String wrongInputMessage) throws IOException {
        return Integer.parseInt(read(wrongInputMessage, DataTypes.INTEGER));
    }

    public String readCleanString() throws IOException {
        String line = br.readLine();
        String result = line.replaceAll("[^A-Za-z]", "").toLowerCase();
        return result;
    }

    public int readFromRange(String wrongInputMessage, int min, int max) throws IOException {
        int value;
        while(true){
            value = Integer.parseInt(read("Incorrect value, please try again:", DataTypes.INTEGER));
            if (value>=min && value<=max){
                return value;
            } else {
                System.out.printf("Number must be in range from %s to %s\n", min, max);
            }
        }
    }

    public static String read(String wrongInputMessage, DataTypes dataType) throws IOException {
        String line;
        while (true){
            line = br.readLine();
            try{
                switch (dataType){
                    case FLOAT:
                        Float.parseFloat(line);
                        return line;
                    case INTEGER:
                        Integer.parseInt(line);
                        return line;
                }
            } catch (Exception e){
                System.out.println(wrongInputMessage);
            }
        }
    }


}
