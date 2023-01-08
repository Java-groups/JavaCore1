package com.edu.practicaltask10;
/*
     2. Enter surname, name and patronymic on the console as a variable of type String. Output on the
        console:
        • surnames and initials
        • name
        • name, middle name and last name
*/

public class FullName {
    public FullName() {
    }

    public static void main(String[] args) {

        String fullName = "Chornyi Petro Ivanovych";

        String[] arr = fullName.split(" ");

        for (String w : arr) {
            System.out.print(w + " ");

        }
        System.out.println();
        System.out.print("\n" + arr[0] + " " + arr[1].substring(0,1) + "." + arr[2].charAt(0) + ".");
        System.out.print("\n" + arr[1]);
        System.out.print("\n" + arr[1] + " " + arr[2] + " " + arr[0]);
        System.out.println();

    }
}
