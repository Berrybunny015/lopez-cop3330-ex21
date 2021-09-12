/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nPlease enter number of the month: "); //ask for the number of the month
        Scanner monthInput = new Scanner(System.in); //scan for the number of the month
        int month = monthInput.nextInt();

        String monthName = "Month"; //string to hold the name of the month w/ initialized name holder

        switch (month) { //switch statement to get the month associated with the user's inputted number
            case 1: //if month = 1
                monthName = "January";
                break;
            case 2: //if month = 2
                monthName = "February";
                break;
            case 3: //if month = 3
                monthName = "March";
                break;
            case 4: //if month = 4
                monthName = "April";
                break;
            case 5: //if month = 5
                monthName = "May";
                break;
            case 6: //if month = 6
                monthName = "June";
                break;
            case 7: //if month = 7
                monthName = "July";
                break;
            case 8: //if month = 8
                monthName = "August";
                break;
            case 9: //if month = 9
                monthName = "September";
                break;
            case 10: //if month = 10
                monthName = "October";
                break;
            case 11: //if month = 11
                monthName = "November";
                break;
            case 12: //if month = 12
                monthName = "December";
                break;
        }

        System.out.println("\nThe name of the month is " + monthName + "."); //tell the user the month that's associated with their inputted number
    }
}