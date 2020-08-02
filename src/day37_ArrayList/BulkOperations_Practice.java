package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("sayem"  );
        students.add("wagar" );
        students.add("beslan" );
        students.add("dawud" );
        students.add("ramazam");
        students.add("mehary" );

        //verify that the names anna bob are contained in students list

        boolean r1 = students.containsAll(   Arrays.asList("Ulku", "Busra", "Muhta"));

        System.out.println(r1);

        System.out.println("===============================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
        group1.addAll(  Arrays.asList("Adam", "Ivana", "Slo") );

        // verify your mentors and close friends names are contained in the list

        group1.containsAll( Arrays.asList("Bob","Sally") );

        System.out.println("==============================");

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "ibrahim","Muhta"));

        System.out.println(employees);

        employees.retainAll( Arrays.asList("Ahmed","Dawud"));//chg to retain all fromremove and keeps al ahmeds and removes others

        System.out.println(employees);


    }
}
