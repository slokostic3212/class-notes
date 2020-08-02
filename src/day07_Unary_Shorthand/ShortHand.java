package day07_Unary_Shorthand;

public class ShortHand {

    public static void main(String[] args) {
        int a = 100;
        // a = a * a;
        a *= a;

        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;

        System.out.println("==================================");

        //+=;

        int z = 300;
        z += 200; //500

        System.out.println(z);

        String schoolName = "Cybertek";
                //schoolName = schoolName+ " School";
        schoolName += "School";

        System.out.println(schoolName);

        String fullName = "Slo";
            fullName += " Kostic'";

        System.out.println(fullName);

        //String firstName = "Aaron Daniel";
        //        firstName -= "Daniel"


        // /=

        int budget = 100000;
            budget /= 2;

        System.out.println(budget);// 4 = 25000

        //
        int q = 100;

        System.out.println(q/2);//50
        System.out.println(q);// 100


        int x = 100;
        x /=2;
        System.out.println(x);//50

        x *=2;//100
        System.out.println(x);//100

        //%=
        int num = 100;
            num %= 3;

        System.out.println(num);

        double num2 = 400.5;// .2 = .2  .1 = .1
               num2 %= 2;

        System.out.println(num2);






    }


}
