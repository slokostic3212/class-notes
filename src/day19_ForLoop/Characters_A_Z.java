package day19_ForLoop;
/*5. Write a program that will print out all letters in English alphabet in ascending order
*/

public class Characters_A_Z {
    public static void main(String[] args) {

        for(char ch = 'A'; ch < 'Z'; ch++) {//can chag to lower case a and get all lower case
            // can give 90 which is char of Z character
            System.out.print(ch+ " ");
        }

        System.out.println();

        for(int i = 97; i <= 122; i++){
            char ch = (char)i;
            System.out.print( ch+ " ");// prints number   need to convert to char to get chars
                                            // add (char) add char ch = (char)i to chag in print
                                            //statement
        }

        System.out.println();

        System.out.println("===================================");

        //task 6 from z to a

        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        //System.out.println("Hello");//give empty prnt statemet before hello so it will print on
                                    // new line
        for (int i = 90; i >= 65; i--){
            System.out.print( (char)i +" ");
        }

        System.out.println();
        System.out.println("==================================");
       /*
        for(int i = 0; i < 65000; i++){
            System.out.print( (char)i +" ");
        }

        */
    }
}
