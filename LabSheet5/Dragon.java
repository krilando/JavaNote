package LabSheet5;

public class Dragon extends Monster {
    public Dragon(String name){
        super(name);
    }

    public Dragon(String name,double spAttackProbability){
        super(name,spAttackProbability);
    }

    /* Q1:
    public int attack(){
        double probability = Math.random();
        int x;
        if(probability>0.3){
            x = (int)(Math.random()*5 + 1); 
            System.out.println(this.getName() + ", of type" + this.getClass() + ", attacks generically: "+ x + " points damage caused.");
        }else{
            x = (int)(Math.random()*50 + 1);
            System.out.println(this.getName() + ", of type" + this.getClass() + ", attacks generically: "+ x + " points damage caused.");
        }
        return x;
    }
    */

    public int specialAttack(){
        int x = (int)(Math.random()*50+1);
        System.out.println(this.getName() + ", of type " + this.getClass() + 
        ", special attack: breath fire: "+ x + " points damage caused.");
        return x;
    }
}
