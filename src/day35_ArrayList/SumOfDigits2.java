package day35_ArrayList;

import day10_IfStatemetns.Character_Identify;

public class SumOfDigits2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for( char each : str.toCharArray() ){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);


            }
        }

        System.out.println(sum);
    }

    /*
    isDigit(char): verifies if char is digit == returns boolean
    isLetter(char): verifies if char is a letter = = returns boolean
    */
}
