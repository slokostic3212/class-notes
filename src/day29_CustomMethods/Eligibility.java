package day29_CustomMethods;

public class Eligibility {
    /*
   4 age citizenship name
   5 alcohol
     */

    public static void eligibilityToBuyAlcohol(boolean hasID, int age){
        if(hasID && age >= 21){

        }else{
            System.out.println("You are eleible to buy milk");
        }
    }
    public static void main(String[] args) {

        vote("John", 28, true, "Trump");

        vote("Daniel", 17, false, "Kayne");

        eligibilityToBuyAlcohol(true, 19);
        calculator(100, '/', 20);

    }

    public static void vote(String name, int age, boolean citizen, String presidentName) {
        boolean eligibilityToVote = age >= 18 && citizen == true;
        if (eligibilityToVote) {
            System.out.println(name + " is eligile to vote for" + presidentName);

        } else {
            System.out.println(name + " is not elible to vote");
        }

    }


        public static void calculator(double num1, char operator, double num2){
            // + - * / % invalid
            switch (operator){

                case'+':
                    System.out.println("Addition: "+ (num1+num2));
                    break;
                case'-':
                    System.out.println("Substraction: "+(num1-num2));
                    break;
                case '*':
                    System.out.println("Multiplication: "+(num1*num2));
                    break;
                case '/':
                    System.out.println("Division: "+(num1/num2));
                    break;
                case '%':
                    System.out.println("Remainder: "+(num1%num2));
                    break;
                default:
                    System.out.println("Invalid Operator");


            }
        }
    }

