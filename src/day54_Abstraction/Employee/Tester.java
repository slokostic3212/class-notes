package day54_Abstraction.Employee;

import java.time.LocalDate;


    public final class Tester extends  Employee{  // can not be super class

        public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary ){
            super(name, gender, DOfB, jobTitle, salary);
        }

        public void findBug() {
            System.out.println(name + " found a bug");
        }

       }

