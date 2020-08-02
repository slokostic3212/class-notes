package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        int num = 6;// 25 will get invalid and the cases after till you reach } ie invalid and wed and thurs
                    // change to long c = 10l - it will not be accepted in switch compie error

                    // float f = 10 give 10.0f change int to float still get compile error 
        String result = "";

        switch(num){

            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";//no need to give break statement at end


        }
        System.out.println(result);
        
    }
}
