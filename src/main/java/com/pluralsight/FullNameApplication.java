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
        String firstName = name.nextLine().trim();


        //Ask user for middle name
        System.out.println("Middle Name?");
        String middleName = name.nextLine().trim();

        // Ask user for last name
        System.out.println("Last Name?");
        String lastName = name.nextLine().trim();

        //Ask for suffix
        System.out.println("Suffix?");
        String suffix = name.nextLine().trim();

        //print out the stuff
        //always print first and last name
        //if they gave a middle name and/or suffix, print it
        String fullName = firstName;

        //Add if statement for middle name
        if(middleName.length() == 0){
            fullName += " ";
        } else {
            fullName += " " + middleName;
        }

        //Add if statement for suffix
        if(suffix.length() == 0){
            fullName += " ";
        } else {
            fullName += " " + suffix;
        }

        //Full name
        fullName = suffix + " " + firstName + " " + middleName + " " + lastName;
        System.out.printf("Full Name: %s %s %s %s", suffix, firstName, middleName, lastName.trim());





    }
}
