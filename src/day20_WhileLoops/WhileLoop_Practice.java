package day20_WhileLoops;
/*
use for loop and covert to while
 */

public class WhileLoop_Practice {// can only give condition in while loop when first declare
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++ ){// will run infintely till false so need interator by increas
            System.out.print(i +" ");// if condis true then statement gets run then the iterator is the last step
        }
        System.out.println();// appends a new line

        int num = 1;// this is initialization step
        while (num <= 10) {// no iterator so it will run infi times

            System.out.print(num +" ");// get 1 2 3 4 5 6 7 8 9 10 give itera before statement then

            num++;// ifthis is before statement you will have a logical error because counting will start from 2
                    // so this is why you put after statement

        }
        System.out.println("==========================================");

        System.out.println();


    }
}
