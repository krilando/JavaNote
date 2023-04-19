import java.util.ArrayList;

public class TestArrayList{
    public static void main(String[] args){
        String word = "JAVA";
        System.out.println(word.length());
        System.out.println(word.substring(1,2));
        
        ArrayList<String> myList = new ArrayList<>();
        myList.add("a");
        System.out.println(myList.size());
    }
}