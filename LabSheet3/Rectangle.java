package LabSheet3;

public class Rectangle {
    private int l; // the rectangle's length.
    private int w; // the rectangle's width.

    public Rectangle(int l,int w){
        this.l = l;
        this.w = w;
    }

    public int CalculateArea(){
        return l*w;
    }

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(8,6);
        Rectangle rectangle2 = new Rectangle(7,7);

        System.out.println("The area of rectangle1 is "+rectangle1.CalculateArea());
        System.out.println("The area of rectangle2 is "+rectangle2.CalculateArea());
    }
}
