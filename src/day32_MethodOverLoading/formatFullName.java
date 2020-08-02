package day32_MethodOverLoading;

import java.util.Scanner;

public class formatFullName {
//formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();     //"cYbErTeK";
        String last =  scan.nextLine();      // "SCHOOL";

/*

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
                // C is what u get from

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first +" " +last;

        //System.out.println(first);
        //System.out.println(last);
*/
        String fullName = formatFullName(first, last);

        System.out.println(fullName);
    }

    public static String formatFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first +" " +last;

        return fullName;
    }

}
