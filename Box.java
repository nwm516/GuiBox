package org.example;

/**
 * Defines Box class for Assignment 4:
 * GUI for Box Class Using Java Swing
 *
 * @author Nicholas Miller
 * @version 10/22/2023
 */

public class Box {
    /**
     * Double variable for length
     */
    private double length;
    /**
     * Double variable for width
     */
    private double width;
    /**
     * Double variable for height
     */
    private double height;


    /**
     * Box constructor for box creation within the GUI
     * @param length    length for box object
     * @param width     width for box object
     * @param height    height for box object
     */
    public Box(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("dimensions of box must not be less than zero.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Getter method for box's length
     *
     * @return  double value for box's length
     */
    public double getLength() {
        return length;
    }

    /**
     * Getter method for box's width
     *
     * @return  double value for box's width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter method for box's height
     *
     * @return  double value for box's height
     */
    public double getHeight(){
        return height;
    }

    /**
     * Setter method for box's length
     *
     * @param length    set box's length
     */
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("length must not be less than zero.");
        }
        this.length = length;
    }

    /**
     * Setter method for box's width
     *
     * @param width     set box's width
     */
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("width must not be less than zero.");
        }
        this.width = width;
    }

    /**
     * Setter method for box's height
     *
     * @param height    set box's height
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height must not be less than zero.");
        }
        this.height = height;
    }
}
