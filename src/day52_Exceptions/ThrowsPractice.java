package day52_Exceptions;

public class ThrowsPractice {

    public static void main(String[] args) throws InterruptedException{
        m1();
        m2();;
    }

    public static void m1() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void m2() throws InterruptedException{
        m1();
    }

    public static void m3() {
        try{
            m2();

        }catch(InterruptedException e){

        }
        // causes the current execution thread to sleep for given seconds

    }
    public static void m4() {
        m3();

    }
}