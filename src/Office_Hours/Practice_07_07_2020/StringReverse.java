package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//"Batch20 School";// chg to School // to scan nextLine();
        //            012345678               // use lenght() - method if you dont know index number

       /* str.charAt(6);// retrieves '0'
        str.charAt(5);// retrieves '2'
        str.charAt(4);// 'h'
        str.charAt(3);// 'c'
        str.charAt(2);// 't'
        str.charAt(1);// 'a'
        str.charAt(0);// 'B' // will get 02hctaB so long so using loop is easier

        use for loop andcharat method

        */
        String result ="";//+= to string does theconcat 0 2 h c t a B
                           //                           1 2 3 4 5 6 7 execution times to give above result

        for (int i = str.length()-1; i >=0;  i -= 1){// 6 5 4 3 2 1 0
        // change to for(int i = str.length()-1;

          result += str.charAt(i);// given in loop so it will repeat so i is index number - this is repeating same as above


        }
        System.out.println(result);// put after loop

        System.out.println("======================================");

        String result2 = "";
        int index = str.length()-1;

        while(index >=0) {// iterator goes after loop

           result2 += str.charAt(index);//addn assignment does the concat
            index -= 1;// statement before iterator - and then iter will get executed
        }
        System.out.println(result2);
    }
}
