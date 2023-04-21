public class StringImmutableTest{
    private String name;
    public static void main(String[] args){
        StringImmutableTest x1 = new StringImmutableTest();
        x1.setName("Bill");
        StringImmutableTest x2 = x1;
        x2.setName("Tom");
        System.out.println(x1.name); //Tom
        System.out.println(x2.name); //Tom

        String s1 = "Hello";
        String s2 = s1;
        s2 = "World";
        System.out.println(s1); //Hello
        System.out.println(s2); //World
    }

    public void setName(String name){
        this.name = name;
    }
}