package day20_WhileLoops;

public class WhileLoop {

    public static void main(String[] args) {

        if(true){                           // executed 1 time
            System.out.println("Hello World");// prints one time

        }
        System.out.println("================================");

        while(true){                       // executed > 1 time infinitely till told to stop
            System.out.println("Hello World"); // while loop is a repeated statement
        }

       // for (int i = 0; i ==0;){// compile error because while loop runs infinitely so above statement is true
                        // and no turn for the for loop to run
    }
}
