package LabSheet2;

public class Pattern2 {
    public static void main(String[] args){
        int i;
        int n = Integer.parseInt(args[0]);

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
}
