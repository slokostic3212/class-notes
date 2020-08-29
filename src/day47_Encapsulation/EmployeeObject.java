package day47_Encapsulation;

import java.util.concurrent.Callable;

public class EmployeeObject {

    public static void main(String[] args) {
        CapitalOneEmployees employee1 = new CapitalOneEmployees("daniel", 34, "tester");

        employee1.setID(123);
        employee1.setAddress("virginia");
        employee1.setSalary(100000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println( employee1.getID());
        System.out.println( employee1.getAddress());
        System.out.println( employee1.jobTitle);
        System.out.println( employee1.getSalary());

        System.out.println(employee1);


    }
}
