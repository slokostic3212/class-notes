package day57_Polymorphism.EmployeeTasks;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $ " + salary +
                ", gender=" + gender +
                '}';
    }
}
