package day29_CustomMethods;
/*
Access Modifier     Specifier    Return-Type   Name( Parameter){
    		statements;
       }
 */

/*
step 1: print hello 5x's
step 2: print school name
step 3: print hello 5x's
step 4: print your name
step 5: print hello 5x's
 */

public class MethodWithoutParameters2 {

    public static void main(String[] args) {

        printHello5x();
        System.out.println("Cybertek");
        printHello5x();
        System.out.println("Slobodanka");
        printHello5x();
    }


    public static void printHello5x(){  //give name that matches the fxnaltiy of method this alone
                                        // will not print wo statement WITHIN body
        for (int i = 10; i >=6; i--) {//no ++ cuz i will always be >6 so need --
            System.out.println("Hello World");


        }


    }

}
