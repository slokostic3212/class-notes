package day18_ForLoop;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Hello World");// if i want to repeat this
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");// what if needs to be repeated x100

        System.out.println("============================================");
        // i=0 is the starting pt = initialization then give condition
                                 // i < 100; is the condition
             // put whateve in ( ) and that will loop

        for (int i = 0; i < 10; i++ ) {// will be false is ==10 or >10 so need to increase i value to
                                    // make that conditon statement false
                                    // so add i++ so that it will loop till the conditon becomes false
                              //i:0 1 2 3 4 5 6 7 8 9 10      at

            System.out.println("Hello World");// result will continue to repeat == loop
                                                // so dont need infinite loop
            //System.out.println("done"); this will never get executed
            // we need to make the condition false == need to do ITERATOR
            // no iteratator == get no compiler error but will get a LOGICAL error
            // if initializations and conditions are Missing ==> get a compile error
            // if iterator is missing ==> get a logical error


        }
    }
}
