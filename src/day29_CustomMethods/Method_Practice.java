package day29_CustomMethods;

public class Method_Practice {
    /*task
1. create a method that can print odd nums btw 1~100 in a same line sep'd by space
2. create a method that can print even nums btw 1~100
*/
    public static void main(String[] args) {

        Method_Practice.oddNumbers();
        System.out.println("Hello");// will print on new line

        oddNumbers();
        System.out.println("Hello");

        evenNumbers();
        System.out.println("Hello");

    }
    // task 1
    public static void oddNumbers(){
        for (int i = 1; i <= 100; i+=2) {// if use ++ need an if condition
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // task 2

    public static void evenNumbers(){
        for (int i = 2; i <=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
