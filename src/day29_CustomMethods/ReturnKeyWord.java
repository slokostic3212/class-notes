package day29_CustomMethods;

public class ReturnKeyWord {
    // 6. calculate the grade of the student based on the score

    public static void main(String[] args) {
        grade(101);// chg to 101 fro 95 get invalid schore output and exits mehtod

        System.out.println("Task Completed");// will not see this becuz system.exit is noted -
                                            // itwill print the invalid schore and then completely exit out
        eligiblityToBuy(17);

    }

    public static void grade(int score){/*

        if(score < 0 || score > 100){
            System.out.println("Invalid score");
            return;
            //System.exit(0);
        }

        char grade = (score >= 90 )? 'A' : ( score >= 80 )? 'B' : ( score >= 70)? 'C' :
                ( score >=60 )? 'D' : 'F';

        System.out.println("Grade is: "+grade);//cant say we dont have a bug

    }

*/}

    public static void eligiblityToBuy(int age){
        if (age<21){
            System.out.println("You are not eligible to buy");
            return;
        }
        System.out.println("You are eligible to buy");
    }
}
