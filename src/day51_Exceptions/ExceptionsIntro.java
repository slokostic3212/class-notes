package day51_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("Test started");

       // System.out.println(arr[100]);//unchecked exceptions (unexpected event) out of  bounds error
                                        // occurs during runtime

        //Thread.sleep(3000);  // called cked exceptions (unwanted event

        String str = "Cybertek";

        System.out.println( str.charAt(-1));// unckd cuz it happened during run-time

        System.out.println("Step 2");

    }
}
