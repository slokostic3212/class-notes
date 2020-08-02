package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Mininum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;
        // whatever user enters it will always be less than 2147483647

        for (int i = 0 ; i < 5; i++){// 5

            System.out.println("Enter a number");
            int n = scan.nextInt();//5 4 6 3 1

            if (n < min ){
                min = n;
            }
        }
        System.out.println("min: "+min);
    }
}
