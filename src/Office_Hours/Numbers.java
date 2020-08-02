package Office_Hours;
/*
 1. write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
 */

public class Numbers {
    public static void main(String[] args) {


        for (int i = 1; i<= 100; i++ ){
            if (i % 3 ==0){
                continue;// now all numbers divisible by 3 will be missing

            }
            System.out.print(i +" ");// stop after printing 100 so goes after sout

            //if (i == 100){
               //break;/// prints nothing but 1 because i == 100 so cant use break statement here because i
                        // will never be equal to 100 == need iterator
            }
        }




}
