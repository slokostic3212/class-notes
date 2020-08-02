package Office_Hours.Practice_06_23_2020;

public class IfStatements_Quiz {
    public static void main(String[] args) {
        // q2

        int score = 0;
        if( score == 0){
            // 0  == 0 ==> true
            score += 50;              //adds 50 to score + 50; = 50;
        }

        if ( score != 0){
            // 50  != 0 ==> true again
               score += 50; // score = 100
        }
        System.out.println(score);

        System.out.println("========================================");
        // q3
        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
        //                     'A=='A' ||  no need to chk 2nd conditon cuz first is already true

        boolean passed2 = grade == 'C' || grade == 'D';
        //                  'A' == 'C'  || 'A' == 'D'
        //                  false               false  ==> false

        if ( passed || passed2){
            // true || false ==> false
            // one true and one fales give false in && logic
            System.out.println("You passed the exam");
        }else{
            System.out.println("you failed");
        }
        System.out.println("=====================================");
        //q9x

        boolean x = true;
        boolean y = !x == false;  // true
        boolean z = y;

        if ( x ){
            System.out.println("Hello Everyone");
        }
        if ( y ){
            System.out.println("Today is a great day");
        }
        if ( z ){
            System.out.println("We are improving everyday");

        }
        System.out.println("==========================================");
    }

}
