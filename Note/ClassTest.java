public class ClassTest{
    public static void main(String[] args){
        
        int a = 4;
        int b = 1;
        int c = 3;
        int result = a = b = c;
        System.out.println(a); // 3
        System.out.println(b); // 3
        System.out.println(c); // 3
        System.out.println(result); // 3

        // Post incrementing
        a = 4;
        result = a++ + a; 
        // 从左往右计算：a++先取值为a的值4，然后++得到5，a++执行完a变为5，但a++还是取4
        // 4+5
        System.out.println(a); // 5
        System.out.println(result); // 9
        a = 4;
        result = a + a++;
        // 从左往右计算：a为4，加a++取4，最后a增1变为5
        // 4+4
        System.out.println(a); // 5
        System.out.println(result); // 8

        // Pre incrementing
        a = 4;
        result = ++a + a;
        // 从左往右计算：++a之后，a变为5，之后式子中a++取5
        // 5+5
        System.out.println(a); // 5
        System.out.println(result); // 10
        a = 4;
        result = a + ++a;
        // 从左往右计算：a为4，++a使a变为5，++a取5
        // 4+5
        System.out.println(a); // 5
        System.out.println(result); // 9
    }
}
