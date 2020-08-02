package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        int num = 10; // 11 12 13 14 15
        while( num< 15){
            System.out.println("Slobodanka");// it will be printed 1 2 3 4 5

            num++;
        }
        System.out.println(num);// get slobodanka 5x and 15 because that is when it became false

        System.out.println("=====================================");

        String str = "Cybertek";// reverse a string
        //            0124567  need decrement

        /*String reverse = "";
        int i = str.length()-1;
        while(i >= 0){
            reverse += str.charAt(i);
            i--;

        }
        System.out.println(reverse);
        */
        String result = "";
        int index = str.length()-1;
        while(index >= 0 ){// willrun for infin till u make change to 0 cuz it will always be true

            result += str.charAt(index);// gets executed 8 x's
            index--;

        }
        System.out.println(result);

        System.out.println();
        System.out.println("===================================");
    }
}
