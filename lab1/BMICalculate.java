package lab1;

public class BMICalculate {
    public static void main(String[] args){
        int weight = Integer.parseInt(args[0]);
        double height = Double.parseDouble(args[1]);
        height /= 100;
        double BMI = weight/Math.pow(height,2);

        // print
        System.out.println("Your weight: "+weight+"kg");
        System.out.println("Your height: "+height+"m");
        System.out.println("Your BMI: "+String.format("%.2f", BMI));
        if (BMI<18.5){
            System.out.println("You are in the Underweight range.");
        }else if(BMI<24.9){
            System.out.println("You are in the Normal range.");
        }else if(BMI<29.9){
            System.out.println("You are in the Overweight range.");
        }else{
            System.out.println("You are in the Obese range.");
        }
    }
}
