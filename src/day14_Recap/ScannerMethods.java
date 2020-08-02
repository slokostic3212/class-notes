package day14_Recap;
import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
         //
        //   double num = input.nextDouble();

       // boolean num = input.nextBoolean();// cannot put in 1234 get error - only true or false
        System.out.println("Do you want to learn Java");//for longer statements use nextLine()
                        // for one word answer use next()
        String num = input.nextLine();// change to nextLine(); from next();

        System.out.println("You have entered "+num);

    }

}
