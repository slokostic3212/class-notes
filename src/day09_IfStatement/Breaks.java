package day09_IfStatement;

public class Breaks {

    public static void main(String[] args) {
        String itsBreakTime = "yes";

        if (itsBreakTime == "yes") {
            System.out.println("Take 15 minute break");
        } else {
            System.out.println("Continue the class");
        }

        System.out.println("================================");
        int a = 100;
        int b = 200;

        if (a > b) {
            System.out.println(a + " is greater");
        }
        else {//give else

            System.out.println(b + " is greater");
        }
    }
}
