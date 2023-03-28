package LabSheet3;

import java.awt.*;

/**
 * Title      : Cat.java
 * Description: This class contains the definition of a cat.
 * Copyright  : Copyright (c) 2006-2023
 * @author      Laurissa Tokarchuk
 * @version     1.0
 * @author      Paula Fonseca
 * @version     1.4
 * @author      Yuchong Chang
 * @version     1.5
 */
public class Cat {  
    // Declaration of instance variables.
    private String  name, furType;
    private boolean tail;  
    private Color   colour; 
    private int     speed; 

    public Cat(){
    }
    /**
     * This is the constructor that initialise all instance variables
     * to the values passed in as parameters to the constructor.
     * @param name the name of cat
     * @param furType the furType of cat
     * @param tail
     * @param colour the colour of cat
     * @param speed
     */
    public Cat(String name,boolean tail, int speed, String furType,Color colour){
        this.name = name;
        this.colour = colour;
        this.tail = tail;
        this.speed = speed;
        this.furType = furType;
    }

    /**
     * This is the method to get the name of cat
     * @return cat's name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the method to set the name of cat
     * @param name cat's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is the method to get the furType of cat
     * @return cat's further Type
     */
    public String getfurType(){
        return furType;
    }

    /**
     * This is the method to set the furType of cat
     * @param furType cat's further Type
     */
    public void setfurType(String furType){
        this.furType=furType;
    }

    /**
     * This is the method to check whether the cat is tailed
     * @return whether the cat is tailed
     */
    public boolean isTail() {
        return tail;
    }

    /**
     * This is the method to set whether the cat is tailed
     * @param tail whether the cat is tailed
     */
    public void setTail(boolean tail) {
        this.tail = tail;
    }
    
    /**
     * This is the method to get the colour of cat
     * @return the colour of cat
     */
    public Color getColour() {
        return colour;
    }

    /**
     * This is the method to set the colour of cat
     * @param colour the colour of cat
     */
    public void setColour(Color colour) {
        this.colour = colour;
    }

    /**
     * This is the method to get the speed of cat
     * @return the speed  of cat
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This is the method to set the speed of cat
     * @param speed the speed  of cat
     */
    public void setSpeed(int speed){
        this.speed=speed;
    }

    /** This is the sleep method for the cat. It dictates the number of 
     *  minutes the cat sleeps.
     * @param duration  The number of minutes to sleep.
     */
    public void sleep(int duration) {
        System.out.println("I am sleeping for " + duration + " minutes.");
    }
	
    /** This method allows the cat to run. The distance (in a straight line)
     *  the cat runs is dependent on how long the cat runs and whether or not
     *  it is running in a zigzag.
     *  @param duration  The number of minutes to run.
     *  @param zigzag    Whether to run in a zigzag pattern.
     *  @return int	 Number of metres ran.
     */
    public int run(int duration, boolean zigzag) {
        System.out.println("I am running "
                           + (zigzag? "in a zigzag" : "straight")
                           + " for "
                           + duration 
                           + " minutes.");	
	    int distanceRun = duration * speed; // assuming speed is metres per minute
	    if (zigzag) {
            /* When in zigzag, distance is 1/3 of what it would have been if 
            the cat was going straight. */
                return distanceRun/3; 
        } 
        else return distanceRun;
    }
}            