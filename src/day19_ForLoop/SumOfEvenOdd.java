package day19_ForLoop;
/*
3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */

public class SumOfEvenOdd {
    public static void main(String[] args) {
        // task 3
        // 0 2 4 6 8 10 .... increased by 2

        int sumOfEven = 0;// cannot find the sum after
      /*  sum +=2;
        sum +=4;
       */
    /*    for (int i = 0; i <= 100; i += 2 ) {
            sumOfEven += i;
        }
            System.out.print(sumOfEven;// chg to sout(sum) from i+" ";
    */
        for (int i= 0; i<=100; i++){
            if(i % 2 == 0) {
                sumOfEven += i;
            }
        }
        System.out.print(sumOfEven);

        System.out.println("======================================");

        // task 4

        int sumOfOdd = 0;
        /*
        if(int i = 1; i <= 99; i += 2 ){
            sumofOdd +=i;
        }
        */

        for (int i = 0; i <= 100; i++){
            if(i%2 != 0){
               // sumofOdd = sumofOdd + i;
                sumOfOdd +=i;
            }
            System.out.print(sumOfOdd);
        }

    }
}
