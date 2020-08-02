package day12_Switch_Scanner;
/*write a program that can find the number of days in a month
        (Assume that Feb has 28 days)

        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12

 */

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 7; // to 11 goes to case 11 prints 30 days and break gets executed and statement gets executed

        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");// one print statement becuz ea section only needs on print statement
                break;                        // change to results = "30days" so prnt state goes after done w
                                                // initializeing after }
            case 2:
                System.out.println("28 Days");
                break;
                //1,3,5,7,8,10,12
            case 1:
            case 3:
            case 5:
            case 7: // change to 7
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


                    /*int a = 10;// each section memory is this then on to the next initialization
            a = 20;
            a = 30;
            a = 50;// if this get intialized this is waht is in menory

         */
    }

}
