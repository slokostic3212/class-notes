package day03_sequences_Variables;
/*
task
	variables : salary, tax
		totalSalary = salary * tax;
		slaryAfterTax = salary - totaltax


		100000,   0.28
		 100000 * 0.28 = 28000
		 100000 - 28000 = 72000
*/

public class SalaryCalculator {

    public static void main(String[] args) {
        double salary = 150000;
        double tax = 0.28;

        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;


        System.out.println(salaryAfterTax);

        int a =100;
        long A = 200;

        // float tax = 0.5;

        // int inum = 123;
        // int@num = 123;

        // will get compiler error

        double number_ = 1234;
        double number$ = 1234;

        //long new = 12345
        // long throw = 12345








    }
}
