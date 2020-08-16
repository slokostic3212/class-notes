package day42_static;

public class Circle {

    double radius;   // ins
    double diameter; // ins
    static double pi = 3.14;       // static

    public void setInfo(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter*pi;
    }

    public String toString(){
       // return "the area of the circle with the radius of " +radius +" is: "+calcArea();
        return "Radius: "+radius+"\nDiameter: "+diameter+"\n PI: "+pi+"\nArea: "+calcArea()+"\nPerimeter: "+calcPerimeter();
    }
}
