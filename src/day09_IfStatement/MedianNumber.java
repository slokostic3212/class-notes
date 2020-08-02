package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMed = (a > b && a < c) || (a > c && a < c);//a is median
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);//b is median
        boolean cIsMed = !aIsMed && !bIsMed;// or logic not used && logic ahs the meaning of both

        double med = 0;

        if(aIsMed){
            med = a;

        }
        if(bIsMed){
            med = b;

        }
        if(cIsMed){
            med = c;

        }
        System.out.println(med +" is the median number");// only need print state at end because
                                                        // med was initialized
    }


}
