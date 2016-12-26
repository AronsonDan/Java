/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public class Circle extends Shape {
    
    private double radius;

    /**
     * @param name
     * @param color
     * @param x
     * @param y
     */
    public Circle(String name, String color, double x, double y, double radius) {
	super(name, color, x, y);
	// TODO Auto-generated constructor stub
	this.radius = radius;
    }

    /* (non-Javadoc)
     * @see com.qa.Shape#getArea()
     */
    @Override
    public double getArea() {
	// TODO Auto-generated method stub
	return Math.PI * Math.pow(this.radius, 2);
    }

    /* (non-Javadoc)
     * @see com.qa.Shape#getCenterPoint()
     */
    @Override
    public Point getCenterPoint() {
	// TODO Auto-generated method stub
	return new Point(super.getX(), super.getY());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Circle [radius=%s, toString()=%s]", this.radius, super.toString());
    }

}
