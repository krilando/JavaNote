package LabSheet2;

public class Pattern1 {
    public static void  main(String[] args){
        int i,j;
        int n = Integer.parseInt(args[0]);
        
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
}
