package day10_IfStatemetns;
/*
int score = 95;
score < 0 || score ?100:
	90-100 = A
	80-89 = B
	70-79 = C
	60-69 = D
	otherwise => F

*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class GradeCalculator {
    public static void main(String[] args) {

        int score = 97;// change to -150 then grade is invalid is executed
        String grade = "";

        if(score >= 90 && score <= 100){ // 90<= score <=100
            grade = "A";// can change to "You made an A"
        }else if(score >=80 && score <=89){ //80<= score <=89
            grade = "B";
        }else if(score >=70 && score <=79){// 70<= score <= 79
            grade = "C";
        }else if(score >=60 && score <=69){// 60<= score <=69
            grade = "D";
        }else if(score >=0 && score <=59){// 0<= score <=59
            grade = "F";//can change to "You made an F"
        }else{// score <0 or score >100
            grade = "Invalid Score";
        }
        System.out.println(grade);
        System.out.println("==========================================");

        
    }



}
