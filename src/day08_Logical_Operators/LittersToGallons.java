package day08_Logical_Operators;
/* 2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
*/

public class LittersToGallons {

    public static void main(String[] args) {
        double litters = 200;
        double gallons = litters / 3.785;

        System.out.println(litters + "litters equal to "+ (int)gallons + " gallons");// 52
        // (int) to give int number

    }


}
