/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public class TestClass {

    public static void main(String[] args) {
	Rectangle r1 = new Rectangle("Rec", "Yellow", 10, 10, 10, 10);
	Rectangle r2 = new Rectangle("Rec", "Yellow", 5, 10, 5, 10);
	Rectangle r3 = new Rectangle("Rec", "Yellow", 10, 10, 20, 30);
	System.out.println(r1);
	System.out.println(r1.getArea());
	System.out.println(r2);
	System.out.println(r2.getArea());
	System.out.println(r3);
	System.out.println(r3.getArea());

	Circle c1 = new Circle("Circle", "Orange", 10, 10, 30);
	Circle c2 = new Circle("Circle", "Orange", 0, 10, 20);
	Circle c3 = new Circle("Circle", "Orange", 7, 3, 10);
	System.out.println(c1);
	System.out.println(c1.getArea());
	System.out.println(c2);
	System.out.println(c2.getArea());
	System.out.println(c3);
	System.out.println(c3.getArea());
    }

}
