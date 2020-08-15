package day41_Static;

public class printingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("cybertek");//cybertek is object  Object comes from object
        System.out.println(str.toString());//object name
        System.out.println(new String("school").toString());//school is object

        System.out.println(str.toString() );
        System.out.println(new String("school").toString()) ;//.toString method can - return method

        System.out.println("==========================================");

        Carpet c1 = new Carpet();//c1 is object name
        c1.customOrder(5,6,19,true);

        System.out.println(c1);//get #code when u pass object of any class in any print statement - need .toString


    }
}
