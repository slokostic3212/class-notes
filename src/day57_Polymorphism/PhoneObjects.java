package day57_Polymorphism;

import day44_Constructor.HumanResource;

public class PhoneObjects {

        public static void main(String[] args) {
            Iphone iphone = new Iphone("12", "5.3", 1000);
            Samsung samsung = new Samsung("S20", "6.1", 899 );
            Huawei huawei = new Huawei("Robbery", "5.3", 25);

            System.out.println(iphone);
            System.out.println(samsung);
            System.out.println(huawei);
    }

}
