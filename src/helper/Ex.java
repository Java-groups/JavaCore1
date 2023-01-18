package helper;


import java.io.*;
import java.util.Arrays;

public class Ex {

    public static void main(String[] args) throws IOException {
       write();
    }

    private static void write() throws IOException{
        String fileName = "test.txt";
        //FileOutputStream file = new FileOutputStream(fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        String st = "Hello World";
        bw.write(st);
        bw.close();
    }

    private static void read() throws IOException {
        String filename = "test.txt";
        FileInputStream file = new FileInputStream(filename);
        byte[] bt = new byte[10];
        int available = file.available();
        int count = file.read(bt,0,available);
        System.out.println(Arrays.toString(bt));
    }
}
