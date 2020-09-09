package day52_Exceptions;

public class Practice {

    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);// error occurs durint runtime
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        System.out.println("test completed");//will not run becuz of above exception
    }
}
