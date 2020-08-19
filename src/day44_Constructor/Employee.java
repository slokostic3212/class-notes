package day44_Constructor;
/*
Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender

            static variables:
            		isEmployeed hasSalary

            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
 */
public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static{
        isEmployed = true;
        hasSalary = true;

    }


    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, double salary, char gender){
        this.name=name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
        //isEmployed = true;// give same resp will execute multiple times should initialize once once use static block
       //hasSalary = true; // can be done here

    }

    public String toString (){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJobTitle:"+jobTitle+
                "\nSalary: "+salary;
    }


}
