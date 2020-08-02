package day07_Unary_Shorthand;

public class Quiz{

    public static void main(String[]args){

        int iNum = 100;
        double dNum = 200;
        float fNumb = 300;

        //iNum = (int)fNum;  in quiz ans line 4 7 9 gave error
        //fNum = iNum;
        //dNum = fNum;
        //fNum = (float)dNum;

        System.out.println("Result A" + 0 + 1);
        //                   "Result A0" + 1
        //                  "Result A01"


        System.out.println("Result B" + (1) + (2));
        //                  "Result B1" + 2
        //                  "Result B12"

        System.out.println( "Result B" + (1 + 2));









    }

}
