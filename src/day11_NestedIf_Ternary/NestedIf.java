package day11_NestedIf_Ternary;
/*90 ~ 100 ==> A
80 ~ 89 ==> B
70 ~ 79 ==> C
60 ~ 69 ==> D
0 ~ 59 ==>  F
otherwise ==> F

 */

public class NestedIf {
    public static void main(String[] args) {
        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) {        //valid score
            if (score >= 90) {
                result = "A";

            } else if (score >= 80) { // gets executed when above is false  so no need to add
                // < 90
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        } else {
            result = "invalid";// invalid score
        }
        System.out.println(result);

        System.out.println("============================================");
    }
    }