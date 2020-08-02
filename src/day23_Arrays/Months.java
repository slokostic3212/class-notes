package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov","Dec"};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(months[n-1]);// to get index 4 you need to -1
    }
}
