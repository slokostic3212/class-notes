package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList <Integer> scores = new ArrayList<>();
        scores.add(95); // autoboxing 3
        scores.add(100);// 2
        scores.add(85);//3
        scores.add(75);// 4
        scores.add(1, 65);// 1
       // scores.add(7, 55);// will get an exception out of bound
        // element now 2 andwill be added to the last index spot 95 is 0 and 100 is 1
        // to print array need to call an externally by passing array list variable

        System.out.println( scores );// 95 100 85

        System.out.println( scores.get(2));

        System.out.println();


    }

}
