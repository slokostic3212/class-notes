package day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
             int age = input.nextInt();// only takes 19 but ENTER button is still in scanner

        input.nextLine();
        System.out.println("Enter your full Name");// only got age because nextLine takes everything and
                                                    // to enter age you typed age and ENTER button and is left
                                                    // in scanners memory
        String fullName = input.nextLine();

        System.out.println("Enter your company Name:");
        String companyName = input.nextLine();// if u use nextLine after nextline no need to put another but if


        System.out.println(fullName+" is "+age+" years old");// gets slo is 21 years old
    }

}
