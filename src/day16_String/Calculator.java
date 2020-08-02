package day16_String;

import java.util.Scanner;

/*
write a program to ask user to enter two number and a math operator

ex 10
	20
	*
	what is ouput : 200

	valid math operators * / - + 5

	if u have precond use nested if -
*/
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter your math operator: ");
        char operator = scan.next().charAt(0);// returns char
        // @  only valid operators

        boolean valid = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';
        if (valid){
           /* switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1-num2);
        }
*/
        }else{
            System.out.println("Invalid Operator");//convert to multibranch or ternary

        }






    }
}
