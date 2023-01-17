package com.edu.hometask12;
/*
2. Create method to validate date according to format "mm.dd.yy"
*/

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidation2 {

    public static void main(String[] args) {


        Format format = new SimpleDateFormat("MM/dd/yy");
        String date = format.format(new Date());
        System.out.println("Current date in format \"mm/dd/yy\" : " + date);
    }

}
