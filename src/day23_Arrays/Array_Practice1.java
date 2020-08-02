package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        // String students =                      // can store only 1 data since single vaiavble can only collect 1

        // String []  students;
        // declar statement

        String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"};// need to fix size of array by giveing data
        // fix size by giving []  tovariable vaible students is collection of 4 strings
        // index numbers start from 0 = 0 1 2 3 == 4 names above
        //                          0           1       2       3

        String name1 = students[1];// put index number and gets element at index 1 (string)
        System.out.println(name1);// prints out Muhtar can chn to 3 and get whats at 3
        // chg to 8 -

        // array size is fixed - above example has 3 index num max and if g"ive > than that get an
        // outbound error msg
        // can use index number to get variable info = = main advantage


        System.out.println("=============================");
        int[] scores = {85, 70, 95, 90, 100};
        //                 0   1   2   3   4
        String[] names = {"Mike", "Adam", "Tony", "John", "Amy"};
        //                  0          1     2       3       4
/*
        System.out.println( names[0] + " : ")+ scores[0]);
        System.out.println( names[1] + " : ")+ scores[0])
        System.out.println( names[2] + " : ")+ scores[0])
        System.out.println( names[3] + " : ")+ scores[0])
        System.out.println( names[4] + " : ")+ scores[0])
        // use a loop instead of do this - for loop

       */

        for (int i = 0; i <= 4; i++) {// i value started from 0 1 2 3 4
            System.out.println(names[i] + " : " + scores[i]);// get mike 5x so give variable i instead of 0
            //to get all names and chg names it i to get
            // everyones score
        }
        System.out.println("=======================================");

        String[] classMates = new String[5];//  contains 5 elements
        classMates[0] = "Faith";
        classMates[2] = "Hazel";
        classMates[1] = "Visorel";
        classMates[3] = "Elkem";
        classMates[4] = "Ahmed";
        classMates[5] = "Muhtar";// get out of bounds msg cuz index does not existt
        // order of name print - faith visorel hazel elkem ahmed

        for (int i = 0; i <= classMates.length - 1; i++) {//4 to classMates.length - 1
            System.out.println(classMates[i]);//result = names above in order 0-4
            //if datatype anything other than primitive will get null
        }




            }
        }

