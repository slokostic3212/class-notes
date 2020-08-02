package day08_Logical_Operators;

    public class Practice3 {

        public static void main(String[] args) {


        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b ==2;
    //                  3 == 2  || 2 == 2  &&  1 == 2
            //          false   || true     &&  false
            //                      false   &&  false
            //                      false



            System.out.println(res);
            System.out.println(b);


            int c = 5;       // c = 6  now c = 5 after c--
            boolean r2 = c++ == 6 || c-- == 5 || c == 5;

            //            5 == 6    6 == 5
            //             false || false           true now r2 changes to true

            System.out.println(r2);//false


           boolean A = true;
           boolean B = !A; // false
           boolean C = A != B && A == !B && !A == B;

           //         true != false && true == true && false == false
            //              true    &&  true        && true


            System.out.println(C);// true






    }

}
