package day07_Unary_Shorthand;
/*
 1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year

 */

public class LeapYear {

    public static void main(String[] args) {

        int year = 2040;// 2021 = false;
        boolean result = year % 4 == 0;

        System.out.println("Year " + year + " is a leap year: " + result);// 2021 is a leap year: false // change to 2040 need
                                                                // need to change 2021




    }





}
