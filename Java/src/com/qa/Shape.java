/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public abstract class Shape {
    
    private String name;
    private String color;
    private double x;
    private double y;

    /**
     * @param name
     * @param color
     * @param x
     * @param y
     */
    public Shape(String name, String color, double x, double y) {
	this.name = name;
	this.color = color;
	this.x = x;
	this.y = y;
    }

    /**
     * @param name2
     * @param color2
     * @param x2
     * @param y2
     */

    /**
     * @return the y
     */
    public double getY() {
	return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(double y) {
	this.y = y;
    }
    /**
     * @return the x
     */
    public double getX() {
	return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(double x) {
	this.x = x;
    }
    /**
     * @return the color
     */
    public String getColor() {
	return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
	this.color = color;
    }
    /**
     * @return the name
     */
    public String getName() {
	return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Shape [name=%s, color=%s, x=%s, y=%s]", this.name, this.color, this.x, this.y);
    }
    
    public abstract double getArea();
    public abstract Point getCenterPoint();
}
