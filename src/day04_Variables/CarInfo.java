package day04_Variables;
/*
task:
    Year
    Brand
    Model
    Mileage
    Price

    ex 2020
       BMW
       x5
       30000
       45000

       output 2020 BMW X5, 30000 mileage, $45000
 */

public class CarInfo {

    public static void main(String[] args) {
        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        short mileage = 30000;// can also use int
        double price = 45000;
        String color = "Red";

        System.out.println(year+" "+brand+" "+ model+" "+ color+", "+mileage +" miles, $"+price);





    }
}
