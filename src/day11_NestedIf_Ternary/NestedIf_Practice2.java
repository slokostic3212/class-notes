package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 5;
        boolean validNumber = day >= 1 && day <= 7;
        String result = "";

        if (validNumber) {
            if (day == 7) {
                result = "Sunday";
            } else if (day == 6) {
                result = "Saturday";
            } else if (day == 5) {
                result = "Thursday";
            } else if (day == 4) {
                result = " Wednesday";
            } else if (day == 3) {
                result = "Tuesday";
            } else {
                result = "Monday";

            }

            System.out.println(result);
        }

    }
}


