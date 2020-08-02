package day11_NestedIf_Ternary;

public class Ternary_Practice2 {

    // ? means "if" and : means "else"

    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if (num > 0){
            result = "Positive";
        }else if (num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("===============================");

        /* write a program that can compare two nuimbers
                a = 10,  b = 20;
                output: b is greater

                a = 30, b = 10;
                output: a is greater

                a = 20, b = 20;
                output = a is equal to b
         */

            int numa = 20;
            int numb = 20;

            String r = (numa > numb) ? numa + " is greater" : (numb > numa) ? numa + " is greater" :
                    (numa + " is equal to "+ numb);
        System.out.println(r);
    }
}
