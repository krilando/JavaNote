package LabSheet5;

public class Troll extends Monster {
    
    public Troll(String name){
        super(name);
        if(name.equals("Saul") || name.equals("Salomon")){
            System.out.println("Error massage!");
            super.setName("Detritus");
        }
    }

    public Troll(String name,double spAttackProbability){
        super(name,spAttackProbability);
        if(name.equals("Saul") || name.equals("Salomon")){
            System.out.println("Error massage!");
            super.setName("Detritus");
        }
    }

    public int specialAttack(){
        int x = (int)(Math.random()*15+1);
        System.out.println(this.getName() + ", of type " + this.getClass() + 
        ", special attack: hit with a stick: "+ x + " points damage caused.");
        return x;
    }
}
