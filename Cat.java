public class Cat extends Animal{
    String name;
    public Cat(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args){
        Animal cat = new Cat("Dazy");
        System.out.println(cat);
    }
}