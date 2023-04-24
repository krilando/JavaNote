package LabSheet5;

public abstract class Monster{
    private String name;
    private double spAttackProbability = 0.2;

    public Monster(String name){
        setName(name);
    }

    public Monster(String name, double spAttackProbability){
        setName(name);
        setProbability(spAttackProbability);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setProbability(double spAttackProbability){
        this.spAttackProbability = spAttackProbability;
    }

    public double getProbability(){
        return this.spAttackProbability;
    }

    /*Q1:
    public int attack(){
        int x = (int)(Math.random()*5 + 1); 
        System.out.println(this.name + ", of type" + this.getClass() + ", attacks generically: "+ x + " points damage caused.");
        return x;
    }
    */

    // Q2 attack:
    public final int attack(){
        int x = (int)(Math.random()*5 + 1); 
        if(x<spAttackProbability){
            specialAttack();
        }else{
            System.out.println(this.name + ", of type " + this.getClass() + ", attacks generically: "+ x + " points damage caused.");
        }
        return x;
    }

    public void move(int direction) {
        switch(direction) {
        case 1:
        System.out.println(this.name + "is moving 1 step NORTH.");
        break;
        case 2:
        System.out.println(this.name + "is moving 1 step EAST.");
        break;
        case 3:
        System.out.println(this.name + "is moving 1 step SOUTH.");
        break;
        default:
        System.out.println(this.name + "is moving 1 step WEST.");
        break;
        }
    }

    public abstract int specialAttack();
}