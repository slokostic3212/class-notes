package day19_ForLoop;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for(int i = 5; i <10; i++){
            System.out.println("Hello");//have 5
            System.out.println("How are you");//have 5
        }

        System.out.println("=====================================");
        for (int i = 1; i <= 5; i++)// wo {} will only repeat 1 single statement / single line
            System.out.println("Hello");
            System.out.println("How are you");// will get 5 Hello and 1 how are you


    }


}
