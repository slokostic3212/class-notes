package day07_Unary_Shorthand;

public class Task4 {

    public static void main(String[] args) {


        // task 4 page 13 unary & shorthanded.pdf

        int Z = 198;
        boolean evenNumber = Z % 2 == 0;
        boolean oddNumber = Z % 2 != 0;

        System.out.println(evenNumber);
        System.out.println(oddNumber);

        System.out.println(Z + " is an even number:" + " " + evenNumber);

        byte a = 30;
        int b = a;
        b += a; /*what is the value of a */ 

        System.out.println(b);




    }

}
