package day12_Switch_Scanner;

public class Switch_Practice2 {

    public static void main(String[] args) {


        String productName = "iphone";// to macbook nothing comes out

        switch (productName) {
            case "galaxy":
                System.out.println("samsung");
                break;
            case "iphone":
            case "ipad":                      //apply || logic can declare these two cases back to bac
            case "MacBook":
                System.out.println("productName");
        }
    }
    }