package day09_IfStatement;

// 2. write a java program that accepts three numbers and return the minimum number
//                (assume that none of them are equal)

public class Minimum {

    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin = a< b && a < c;

        boolean bIsMin = aIsMin == false && b < c;
        //      b<a && b<c; or !aIsMin && b < c:

        boolean cIsMin = aIsMin == false && bIsMin == false;
        //  !aIsMin && bIsMin; or !(aIsMin || bIsMin);

        double min = 0;

        System.out.println(min);
        // any variable declared win block is a local variable and must
        // be initialized

        if(aIsMin){
            min = a;// only initialize a if the statement is true

        }
        if (bIsMin){
            min = b;

        }
        if (cIsMin){
            min = c;
        }
        System.out.println(min+ " is the minimum number");
    }



}
