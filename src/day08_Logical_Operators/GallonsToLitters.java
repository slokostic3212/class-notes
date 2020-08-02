package day08_Logical_Operators;
/*
 1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
*/

public class GallonsToLitters {

    public static void main(String[] args) {
        double gallons = 15;// change to 20 gives you 75.7 litters
        double litters = gallons * 3.785;
        System.out.println(gallons+ "gallons equal to "+ litters+" litters");








    }
}
