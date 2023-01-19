package com.softserve.hw10_StringRegex;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringService ss = new StringService();
        ss.input();
        System.out.println(ss.longestWord());
        System.out.println(ss.reverseOrder());
        System.out.println(ss.replacement());
        ss.currency();
    }

}
