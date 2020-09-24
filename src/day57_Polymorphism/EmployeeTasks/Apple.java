package day57_Polymorphism.EmployeeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {

        Employee tester1 = new Tester("Andrii",516875,"QA",120000,'M');
        Employee tester2 = new Tester("Musa Moylam", 123456, "SDET", 130000, 'M');

        Employee developer1 = new Developer("Hajar", 12098, "Team lead", 12000, 'F');
        Employee developer2 = new Developer("Fatime",23344,"software engineer",156000,'F');

        Employee scrumMaster =  new ScrumMaster("Isabel",891234, "Scrum Master", 124_000, 'F');

        //scrum team

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2, developer1, developer2, scrumMaster));

        for (Employee each : scrumTeam){
            System.out.println(each);
        }

    }
}
