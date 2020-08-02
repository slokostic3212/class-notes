package day04_Variables;

public class Variables3 {
    public static void main(String[] args) {

        //school name: "Cybertek School"

        String schoolName = "Cybertek School";

        System.out.println(schoolName);

/*
task:
    declare the following variables:
    employeeName
    employeeID
    jobTitle
    salary
    gender (char)
    isFullTime (boolean)

 */
       String empName = "Slo Kostic";
       String empID = "Slo Kostic01";
       String jTitle = "Tester";
       int sal1 = 120;
       char gen1 = 'F';
       boolean fT = true;

/*        System.out.println(empName);
        System.out.println(empID);
        System.out.println(jobTitle);
        System.out.println(sal1);
        System.out.println(fT);
*/
        //muhtar examples


/*        String employeeName
        int employeeID
        String jobTitle
        double salary
        char gender
        boolean isFullTime
*/
        System.out.println("============================");

        String employeeName = "Slo";// 'employee Name: " +  employeeName
        int employeeID = 123456;
        String jobTitle = "SDET";
        double salary = 120000.50;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("Employee Name is " + employeeName);
        System.out.println("Employee ID is " + employeeID);
        System.out.println("Job Title is " + jobTitle);
        System.out.println("Salary is " + salary + " USD");
        System.out.println("Gender: " + gender);
        System.out.println("Is Full Time: " + isFullTime);



    }





}
