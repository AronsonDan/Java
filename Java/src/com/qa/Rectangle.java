/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public class Rectangle extends Shape {
    
    private double height;
    private double width;
    private boolean isSquare;


    /**
     * @param name
     * @param color
     * @param x
     * @param y
     * @param height
     * @param width
     * @param isSquare
     */
    public Rectangle(String name, String color, double x, double y, double height, double width) {
	super(name, color, x, y);
	this.height = height;
	this.width = width;
	this.isSquare = isSquare();
    }

    /* (non-Javadoc)
     * @see exercise20161226.Shape#getArea()
     */
    @Override
    public double getArea() {
	// TODO Auto-generated method stub
	return this.height * this.width;
    }

    /* (non-Javadoc)
     * @see exercise20161226.Shape#getCenterPoint()
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
	return String.format("Rectangle [height=%s, width=%s, isSquare=%s, toString()=%s]", this.height, this.width,
		this.isSquare, super.toString());
    }
    
    public boolean isSquare() {
	if (this.height == this.width) {
	    this.isSquare  = true;
	}
	return this.isSquare;
    }
}
