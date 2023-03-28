package LabSheet2;

/** 
 * This is my first properly documented piece java code.
 * When the javadoc tool is run over this code, it will 
 * create an HTML maintenance manual.
 * @author Laurissa Tokarchuk
 * @version 1.0
 * @author Paula Fonseca
 * @version 1.1
 * @author Yuchong Chang
 * @version 1.2
 */
public class CountUpExample {

    /** 
     * This method counts up from zero
     * to a specified number.
     * It will print its progress to the 
     * command line.
     * @param count The number to count to.
     */
    public void countUp(int count) {
        /* Note: If there are no brackets after a for 
         * loop, it is only the sentence that 
         * immediatly follows which is part of the loop. 
         */
        for (int i=1; i <= count; i++) 
	    System.out.println(i);
		
        System.out.println("\nTime is up!");
    }

    /**
     * Main now only creates a new instance of my 
     * program and calls the program's method.
     * @param args  The program does not use this parameter.
     */
    public static void main (String[] args) {
        CountUpExample counter = new CountUpExample();
        counter.countUp(5);
    }
}