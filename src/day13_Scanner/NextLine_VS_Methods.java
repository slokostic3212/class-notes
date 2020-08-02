package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// 120000Enter key in memory
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();//  take numbers120000 assigned here still have Enter key in memory
                                            // 120000
        scan.nextLine();            // to take out the Enter button click out of memory

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();// here Enter will be assigned

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);

    }
}
