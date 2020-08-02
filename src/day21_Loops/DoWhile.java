package day21_Loops;

public class DoWhile {

    public static void main(String[] args) {

        boolean result = false;

        while(result){
            System.out.println("Hello World");
        }

        System.out.println("=========================================");

        do{ // jsut do it and if wrong don't do it
            System.out.println("Hello World");// executes at least one time even if false
        }while(result); // can also repeat statements as long as condition is true
                        // if both conditions true will get executed inf

                        // do while will not get executed if while loop is true == infinite
                        // if while loop is false = no exection
                        // then do while loop gets executed once -




    }
}
