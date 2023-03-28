package LabSheet3;

/**
 * Title      : Counter.java
 * Description: This class contains the definition of a counter.
 * Copyright  : Copyright (c) 2006-2023
 * @author      Yuchong Chang
 * @version     1.0
 */

public class Counter {
    // Declaration of instance variables.
    private int count;
    private int max;

    /**
     * This is the constructor that initialise count to 0 and max to 10.
     */
    Counter(){
        count = 0;
        max = 10;
    }

    /**
     * This is the method to get the current count
     * @return count
     */
    public int getCount(){
        return count;
    }

    /**
     * This is the method to get the max of count
     * @return the max of count
     */
    public int getMax(){
        return max;
    }

    /**
     * This is the method to set the count
     * @param n count
     */
    public void setCount(int n){
        count = n;
    }

    /**
     * This is the method to set the max
     * @param n max
     */
    public void setMax(int n){
        max = n;
    }

    /**
     * This is the method to increase the count value by 2.
     * It resets the counter when the count value reaches the 
     * max value.
     */
    public void increase(){
        count += 2;
        if(count>=max){
            reset();
        }
    }

    /**
     * This is the method to increase the count value by n.
     * It resets the counter when the count value reaches the 
     * max value
     */
    public void increase(int n){
        count += n;
        if(count>=max){
            reset();
        }
    }

    /**
     * This is the method to decrease the count value by 1.
     * It resets the counter when the count value reaches 0.
     */
    public void decrease(){
        count -= 1;
        if(count<=0){
            reset();
        }
    }

    /**
     * This is the method to decrease the count value by n.
     * It resets the counter when the count value reaches 0.
     */
    public void decrease(int n){
        count -= n;
        if(count<=0){
            reset();
        }
    }

    /**
     * This is the method to double the count value
     */
    public void doubler(){
        count *= 2;
    }

    /**
     * This is the method to reset the count value
    */
    public void reset(){
        count = 0;
        System.out.println("Counter Reset!");
    }

    /**
     * This method could simply display
     * the current values of count and max.
     */
    public String toString(){
        return "count: "+count+"\n"+"max: "+max+"\n";
    }
}
