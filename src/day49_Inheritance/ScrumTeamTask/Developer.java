package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Employee called called Developer
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
 */
public class Developer extends Employee{
    public Developer(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age,gender,salary,ID,jobTitle);
    }
    public void coding(){
        System.out.println(name+" is developing while hitting his head");
    }
    public void fixBug(){
        System.out.println(name+" is fixing bugs while cursing the tester");
    }
}
