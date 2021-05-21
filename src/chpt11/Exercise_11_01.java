package chpt11;
import java.text.DecimalFormat;
import java.util.Scanner;

//Exercise 11.1 p.445 (468)
//Class: Triangle and SimpleGeometricObject

/*
(The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
■ A no-arg constructor that creates a default triangle.
■ A constructor that creates a triangle with the specified side1, side2, and
side3.
■ The accessor methods for all three data fields.
■ A method named getArea() that returns the area of this triangle.
■ A method named getPerimeter() that returns the perimeter of this triangle.
■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19. The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes.
Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and
set the color and filled properties using the input. The program should display the area, perimeter, color, and true
or false to indicate whether it is filled or not.
 */



public class Exercise_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) sides[i] = input.nextDouble();
        System.out.print("Enter a triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = Boolean.parseBoolean(isFilledString);

        Triangle t = new Triangle(sides[0],sides[1],sides[2]);

        t.setColor(color);
        t.setFilled(isFilled);

        System.out.println("facts about this triangle...");

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("the area is " + df.format(t.getArea()));
        System.out.println("the perimeter is " + t.getPerimeter());
        System.out.println("color is " + t.getColor());
        System.out.println("this triangle is filled? " + t.isFilled());
    }
}
