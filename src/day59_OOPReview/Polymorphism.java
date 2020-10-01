package day59_OOPReview;

import day50_Inheritance_Overriding.ShapeTask.Circle;
import day50_Inheritance_Overriding.ShapeTask.Rectangle;
import day50_Inheritance_Overriding.ShapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        Shape shape1 = new Circle(3);

        // System.out.println( shape1.radius );

        System.out.println(     ( (Circle)shape1  ).radius     );

        // shape1.length;
        //  System.out.println(   ( (Rectangle) shape1 ).length     );


        Rectangle r1 = new Rectangle(3, 5);

        Shape shape2 = (Shape)r1; // upcasting

        // Shape shape3 = (Circle)r1;
    }
}
