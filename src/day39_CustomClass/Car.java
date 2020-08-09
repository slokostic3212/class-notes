package day39_CustomClass;

public class Car {
    /*Attributes;
        model brand mileage color year price
     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void seInfor(String carBrand, String carModel, int carYear, String carColor, double carMileage,
                        double carPrice ){
                                                // has static - not an instance method -
                                                // attributes need instance variables
                                                // actions/fxns need instance method
                            // need static gone so to use instance to get 1 copy for each object
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;




    }
/* car1 - Toyota
    car2 - BMW
 */



}
