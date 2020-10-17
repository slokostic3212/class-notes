package day62_Maps;

public class String_VS_Builder_VS_Buffer {

    public static void main(String[] args) {
        String str1 = "Cybertek";

        str1.concat("School");// "Cubertek School"

        System.out.println(str1);// immutable Cybertek

        System.out.println("================================");

        String str2 =new String("Cybertek");

        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append(" School ");
        sb1.reverse();
        System.out.println(sb1);//loohcS ketrebyC

        System.out.println("==================================");

        String name = "Level";
        String reversedName = new StringBuilder(name).reverse().toString();

        System.out.println(name.equalsIgnoreCase(reversedName));

        System.out.println("===============================");
        //converting string to stringBuilder
        String s3 = str2.toString();

        System.out.println("========================");



    }
}
