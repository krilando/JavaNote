package LabSheet2;

public class Patterns {
    public void printPattern1(int n) {
        // Write your code here (taken from your solution of Question 1).
        int i,j;
        
        for(i=0;i<n+1;i++){
            for(j=0;j<i;j++){
                System.out.print(j+1);
                if(j<i-1){
                    System.out.print(" ");
                }else{
                    System.out.print('\n');
                }
            }
        }
    }
    public void printPattern2(int n) {
        // Write your code here (taken from your solution of Question 2).
        int i;

        for(;n>0;n--){
            for(i=1;i<=n;i++){
                System.out.print(i);
                if(i!=n){
                    System.out.print(" ");
                }else{
                    System.out.print('\n');
                }
            }
        }
    }
    public static void main(String[] args) { // Write your code here. }
        int n = Integer.parseInt(args[0]);
        
        Patterns pattern = new Patterns();
        pattern.printPattern1(n);
        pattern.printPattern2(n); 
    }
       
}
