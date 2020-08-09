package day39_CustomClass;

public class CarMax {

    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCarInfo("jag", "etype", 1966,"green", 3200, 165000);
        car2.setCarInfo("corvette", "stingray", 1965, "yellow", 4200, 185000);
        car3.setCarInfo("Lexus","RX350", 2019, "White", 14000, 45000);
        car4.setCarInfo("Lexus", "RX450", 2020, "Black", 1000, 50000);
        car5.setCarInfo("Bugatti", "Veyron", 2018, "Blue", 23000, 500000);


        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();

    }



}
