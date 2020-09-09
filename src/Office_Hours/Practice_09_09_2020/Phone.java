package Office_Hours.Practice_09_09_2020;
/*
PHONE;
	brand model price madeIn call() text()
     static - brand madeIn
     instance - model brand	call() text() toString()
 */
public class Phone {

    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Phone(String model, double price){
        this.model = model;
        this.price = price;
    }

    protected void call(long phoneNumber){
        System.out.println("phone is calling: "+phoneNumber);
    }

    protected void text(long phoneNumber){
        System.out.println("phone is texting to: "+phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+"Model: "+model+"Price: "+price+"Made in: "+madeIn;
    }
}
