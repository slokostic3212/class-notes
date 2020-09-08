package Office_Hours.Practice_09_08_2020;

public class Data {
    private int a = 100;// hide data win this class by giving it private
    // assign to variable to later use this data

    private static void method1(){

    }
    public void metod2(){
        System.out.println(a);
        method1();
    }
}

class Test{

    public static void main(String[] args) {
        Data obj1 = new Data();

        //System.out.println( obj1.a);// restricting to get acces
                                    // default protected public can get access
       // obj1.method();//get comp error till you change to pub static void

    }
}