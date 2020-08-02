package day29_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {

/*    public static void main(String[] args) {
        printHello(5);/*/// get comp error since no info is noted here () need int n which data
                        // datatype is int so ( int ) needs to be here ie 5 6 etc this is called an argument


       // public static void printHello(int numberOfTimes) {/*/// pass the info to here
                                          //once this is provided need to provide an argument
       // for (int i = 0; i < numberOfTimes; i++){ // need to change to n since you dont know

         //   System.out.println("Hello World");
  //      }

 //       System.out.println("==========================");
   //         age(2000, 1990);




    //    public static  void  printHello(int numberOfTimes){

      //      for(int i=0; i < numberOfTimes; i++){
     //           System.out.println("Hello World");
      //      }

       // }


       // public static void age(int birthYear , int currentYear){

        //    if(currentYear < birthYear){
         //       System.out.println("Invalid Entry");
          ///  }else {
         //       int age = currentYear - birthYear;
         //       System.out.println("You are " + age + " years old");
          //  }
         //   }
        public static void main(String[] args) {

            printHello(5);

            System.out.println("=======================================");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter birth year and current");
           /* int birthYear = scan.nextInt();
            int currentYear = scan.nextInt();
         */
            age(scan.nextInt(), scan.nextInt());// chg birth yr to scan2000 1990
                    //age(2000, 1990);
        }


    public static  void  printHello(int numberOfTimes){

        for(int i=0; i < numberOfTimes; i++){
            System.out.println("Hello World");
        }

    }


    public static void age(int birthYear , int currentYear){

        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }

    }


}