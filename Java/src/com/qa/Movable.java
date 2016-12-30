/**
 * 
 */
package com.qa;

/**
 * @author Dan Aronson
 *
 */
public interface Movable {
    
    public Point getCurrentLocation();

    public void move(double x, double y);
}
