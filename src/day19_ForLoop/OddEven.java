package day19_ForLoop;
/*
1. write a program that can print all even numbers between 0 ~ 100 that can be divisible by
    by 3 & 5
2. write a program that can print all odd numbers between 0 ~ 100

 */

public class OddEven {

    public static void main(String[] args) {


        //task 1

        // odd number starts from 1 increased by 2 each time for ood
        // can also use < 100

        for (int i = 1; i <= 99; i += 2) {

            if ( i % 5 == 0 && 1 % 3 == 0) {
                System.out.print(i + " ");//needs to be btw {}
            }

        }
        System.out.println("Hello");// prints next to 14 45 75 which i dont get

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {// now get ood numbers ==> precondtion i must be odd
                if (i % 5 == 0 && 1 % 3 == 0) {//just put a nested if in a loop body
                    // sub conditon ==must be divisble by 3 &5
                    System.out.print(i + " ");// ihere reps 0-100 above example was ood
                    // not get all odd numbers
                    // ifu declare varibale in for loop can use only in that loop

                }
            }
        }
        System.out.println();

        System.out.println("=======================================");

        // task 2

        // 0 2 4 6 8 10 ..... 100

        for (int i = 0; i <= 100; i+=2 ){
            if(i % 5==0 && i% 3==0){ // get 0 30 60 90
                System.out.print(i+" ");// prints all even numbrs wo givin a condtion
            }

        }
        System.out.println();// gives a new line

        for(int i = 0; i <= 100; i++){
            if( i % 2 ==0) {                   // preconditon number must be even
                if (i % 3 == 0 && i % 5 == 0) {// numb must be divisble by 3 & 5
                    System.out.print(i + " ");//prints all the numbers
                    // will get even numbers after nested if
                }
            }


        }
    }
}
