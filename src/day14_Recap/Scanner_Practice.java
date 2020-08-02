package day14_Recap;
/*task:

1 gender  		next()
2 age 			nextint()
3 country name  next()
4 zip code      next()
5 full name  	nextLine()
6 full company name  nextLine()
*/

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Enter Enter
        System.out.println("Enter your gender");
        String gender = input.next();// femaleENTER only female gets assigned

        System.out.println("Enter your age; ");
        int age = input.nextInt();

        input.nextLine();// Enter Enter
        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipCode = input.nextInt();//12345 still ahve one more Enter

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();// need to use input.nextLine()

        System.out.println("Enter your company name");




    }
}
