package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz2 {
    public static void main(String[] args) {
        String opt = "true";//change to switch from boolean
        switch (opt){

            case "true"://true needs to match whats in (opt) cant be opt need to be
                System.out.println("True");
                break;
            default:
                System.out.println("False");
        }
        System.out.println("Done");

        float f1 = (123451.1 > 12345.0) ? 12456 : 123456.02f;

        System.out.println(f1 == 12456);


        System.out.println("========================================");

        //line1
        //
        // byte short int long

        int x = 1;// to text will get compiler errors because case value is not matching data type
        switch (x){
            case 1:
            case 2:
        }




    }
}
