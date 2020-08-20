package day44_Constructor;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1 = new Student("Meerim", 20, 'F');
        //student1.setInfo("Mike", 18, 'M');// deleted here cuz not using in studen class

        Student student2 = new Student("Nickolas", 21, 'M');
        //student2.setInfo("Rakhat", 28, 'F');//deleted here cuz not using in studen class

        Student student3 = new Student("Murat", 22, 'M');
       // student3.setInfo("Belek", 30, 'M');//deleted here cuz not using in studen class

        System.out.println( student1 );
        System.out.println( student2 );
        System.out.println( student3 );

    }
}
