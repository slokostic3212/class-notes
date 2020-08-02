package Office_Hours.Practice_07_08_2020;

//finding max number from user inputs

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;  // max = 5 now it chgs to 20

        /*
        for (int i = 1; i <= 5; i++){
            // cannot assign 0 because neg number cannot be >0

            System.out.println("Enter a number");// both steps get used once but needs to be repated 5 xs
            int n = scan.nextInt();// so they need to go in loops body not above
                                    // 5 5 4 3 10 user enterd numbs

            if (n > max){// n is first user input // true in first 5 second ex its false 5!=5 3rd false also
                                                    // false 4th x 3 != 5 5th exec true 10 is > max (5)
                max = n;
            }

        }

         */
        int j = 1;
        while (j <= 5) {// will run infi becuz the condition is not false - need to inc val of j

            System.out.println("Enter a number");// both steps get used once but needs to be repated 5 xs
            int n = scan.nextInt();// so they need to go in loops body not above
            // 5 5 4 3 10 user enterd numbs

            if (n > max) {// n is first user input // true in first 5 second ex its false 5!=5 3rd false also

                max = n;


            }
            j++;

        }
        System.out.println("max: " + max);
    }
}