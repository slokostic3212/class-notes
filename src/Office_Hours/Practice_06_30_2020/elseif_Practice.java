package Office_Hours.Practice_06_30_2020;

//a b c d f or invalid = ==  6 possibitlies

public class elseif_Practice {
    public static void main(String[] args) {

        int score = 80;

        char grade = ' ';

        if (score >= 90 && score <= 100){
            grade = 'A';

        }else if (score >= 80 && score <90){// take out && statemnt portion if score is <90
            grade = 'B';

        }else if (score >=70 && score <80){// take out && <80
            grade = 'C';

        }else if (score >=60 && score < 70){// take out && <70
            grade = 'D';

        }else {
            grade = 'F';   // can also take this multibranch to ternary -

        }
        System.out.println(grade);

        char grade2 =  (score >= 80 && score <90)    ? 'A' :(score >= 80) ? 'B'
                        :(score >=70)? 'C' :(score >=60)? 'D' : 'F';  // returns same value = only one block gets
                                                                        // executed

    }
}
