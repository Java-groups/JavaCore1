package com.softserve.hw12_FunctionalInterfaces;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        EncryptDecrypt ed = new EncryptDecrypt();
        System.out.println(ed.encrypt("abc", 3));
        System.out.println(ed.decrypt("def", 3));

        DateValidation dt = new DateValidation();
        dt.dateValidation();
    }
}
