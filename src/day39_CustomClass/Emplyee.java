package day39_CustomClass;

public class Emplyee {
/*
attributes
    employeeName gender SSN JobTitle salary
 */

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);
        SSN = SSN.substring( SSN.length()-4 );
        System.out.println("Last for digits of SSN: " +  SSN );
    }
}
