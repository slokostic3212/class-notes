package day06_ComparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting - automatically done

        long l2 = (long)s1; // to do manually do this use ()
                            // if we implicit man ually

        int I1 = 300;
        double D1 = I1; //300.0 because the int is implicitly casted to dbl so get decimal

        System.out.println(D1);

        double D2 =(double) I1;

        System.out.println("===========================");
         double d1 = 400.55555;

         int i1 = (int)d1; // will get compiler error because it is not done automatically so hyou haveto (int)
                            // 400
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1;// if i choose to use byte i cannot assign this value

        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1; // byte explicit casting but byte does not have range

        System.out.println(b1);//-24

        double m1 = 34.5;
        float f1 = (int)m1; // cast to long = 34 int = 34.0

        System.out.println(f1);// still get 34.5

        long r1 = -500;
        int p1 = (short)r1;// -500 for int

        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte)r2;
        System.out.println(t1);






    }
}
