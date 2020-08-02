package day08_Logical_Operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfStatement {
    public static void main(String[] args) {
        int a = 2000;// change to 100 from 10 change to 2000
        int b = 2000;// change to 200 from 20

       // System.out.println(a+" is the larger number"); only if a is larger than b so need
        // if statement

        if(a > b){
            System.out.println(a+" is the maximum number");// change to maximum from largest
        }

        if ( b > a ){
            System.out.println(b+" is the maximum number");// false first one gets executed
        }

         if ( a == b ){
             System.out.println("Both are equal");

         }


        System.out.println("===============================");

         boolean BreakTime = false; //change to false

         if(BreakTime == true){
             System.out.println("Take 15 minute break");
         }

         if(BreakTime == false){
             System.out.println("Keep Studying");
         }


        System.out.println("============================");
         boolean Corona = true;
         if (Corona == true){
             System.out.println("Buy more toilet paper");
             System.out.println("Buy more hand sanitizers");
             System.out.println("Social Distance");
             System.out.println("Stay at home");
         }






    }










}
