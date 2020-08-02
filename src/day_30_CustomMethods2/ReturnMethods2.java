package day_30_CustomMethods2;

public class ReturnMethods2 {

    public static void main(String[] args) {
        String name = "Level";
       // revStr1(name);// only prints reverse no value
        //System.out.println(name.equalsIgnoreCase());

        String reverseName = revStr2(name);
        System.out.println( name.equalsIgnoreCase(name));
    }



    public static void  revStr1(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);// to concat use +=

        }
        System.out.println(result);


    }
    public static String revStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);// to concat use +=

        }
        return result;

    }
}
