package day11_NestedIf_Ternary;
/* sal = 30K
job hx = 2yrs
 */

public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 120000;
        int jobHistory = 5;

        if (salary >= 3000){
            if (jobHistory >= 2) {
                System.out.println("You are qualified");

            }else {
                System.out.println("You must have been on the job at least 2 years");
            }

            }else{
                System.out.println("You must earn at least $30K");
            }
        }


    }



