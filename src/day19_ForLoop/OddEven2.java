package day19_ForLoop;
/*
3. print odd numbers 1 to 50 using continue statemetn

4. print even numbers 1 to 50
 */

public class OddEven2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i ++ ){// to print of we can choose to skip even numbers

            if (i % 2 != 0){// here means if number is odd then skip it get all even from 2-0
                continue;// change != to == and get all odd numbers
                // cant print both even on sep lines

            }

            System.out.print(i+" ");


        }

        for(int i =0; i <= 50; i++) {  // in order to print odd, we can choose skip even number

            if (i % 2 == 0) { // if the number is even, then skip
                continue;
            }

            System.out.print(i + " ");
        }

    }
}
