package day22_NestedLoop;

public class Nested_Loop3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            System.out.print("*");// print does not append a new line

        }

        System.out.println();
        /*
        *******
        *******
        *******
         */

        int j = 1;
        while( j <= 10){// change to 4
            for (int i = 1; i <= 5; i++){//chg 10
                System.out.print("*");// print does not append a new line

            }

            System.out.println();


            j++;
        }
    }
}
