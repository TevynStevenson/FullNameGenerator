package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //Prompt user to enter their name
        //First, Middle, Last
        //Add new scanner
        Scanner name = new Scanner(System.in);

        System.out.println("Please Enter Your Name?");

        // Ask user for first name
        System.out.println("First Name?");
        String firstName = name.nextLine();


        //Ask user for middle name
        System.out.println("Middle Name?");
        String middleName = name.nextLine();

        // Ask user for last name
        System.out.println("Last Name?");
        String lastName = name.nextLine();




    }
}
