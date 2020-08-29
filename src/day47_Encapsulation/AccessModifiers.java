package day47_Encapsulation;

public class AccessModifiers {

    //public
    public static int publicVariable = 100;// 1 variable

    public static void publicMethod(){
        System.out.println("public method");// 1 method

    }

    //default

    static int defaultVariable = 200;

    static void defaultMehtod(){
        System.out.println("default method");
    }

    //private - - only accessible within the class
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);// all are called bc of static
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMehtod();
        privateMethod();


    }
}
