package day34_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str = "123";
        int a =  Integer.parseInt(str);          //123

        System.out.println(str + 1);//123 ==> 1231 a concat
        System.out.println(a +1 );  // 123 neither of these are the same one is an int and the other a string
                                    // 124 its a number so can add

        Double d1 = Double.parseDouble("7.5");// parse returns primitive value   // auto
        //double d2 = 12.5;
        System.out.println(d1-1);//6.5

        String s1 = "true";

        boolean b1 = Boolean.parseBoolean(s1);

        System.out.println(!b1);//true add ! get false

        System.out.println("====================================================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2);// this will return a wrapple class if chng to double d2 = unboxing

        System.out.println(d2*2);//10000.5 *2

        String s3 = "FaLSe";
        boolean r2 =Boolean.valueOf(s3); // unboxing

        System.out.println(r2);//false


    }
}
