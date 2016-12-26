/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public class Point {

    private double x;
    private double y;

    /**
     * @param d
     * @param e
     */
    public Point(double d, double e) {
	this.x = d;
	this.y = e;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Point [x=%s, y=%s]", this.x, this.y);
    }

    /**
     * @return the x
     */
    public double getX() {
	return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(int x) {
	this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
	return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(int y) {
	this.y = y;
    }

}
