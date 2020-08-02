package day11_NestedIf_Ternary;
/* program that can find number of days in month must apply nestedif
*/
public class DaysInMonth2 {

    public static void main(String[] args) {
        int month = 5; // 1~12

        boolean days28 =  month == 2;  // for the months that has 28 days

        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        // for the months that has 30 days

        boolean invalid = month < 1 || month > 12;

        String result = "";

        if(days28){
            result = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(invalid){
            result = "Invalid";
        }else  {
            result = "31 days";
        }

        System.out.println(result);


    }


  }






