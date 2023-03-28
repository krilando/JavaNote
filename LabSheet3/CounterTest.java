package LabSheet3;

public class CounterTest {
    public static void main(String[] args){
        //iii)
        Counter counter = new Counter();
        System.out.println("count : "+counter.getCount());
        System.out.println("max : "+counter.getMax());
        counter.setCount(5);
        counter.setMax(8);
        System.out.println("count : "+counter.getCount());
        System.out.println("max : "+counter.getMax());
        System.out.println();

        //iv)
        counter.increase();
        System.out.println("count : "+counter.getCount());
        counter.decrease();
        System.out.println("count : "+counter.getCount());
        counter.doubler();
        System.out.println("count : "+counter.getCount());
        counter.reset();
        System.out.println("count : "+counter.getCount());
        System.out.println();

        //v)
        System.out.println(counter.toString());
        System.out.println();

        //vi)
        counter.setCount(0);
        counter.setMax(5);
        int i;
        for(i=0;i<5;i++){
            counter.increase();
            System.out.println("count : "+counter.getCount());
        }
        counter.setCount(3);
        for(i=0;i<3;i++){
            counter.decrease();
            System.out.println("count : "+counter.getCount());
        }
        System.out.println();

        //vii)
        counter.setMax(10);
        counter.increase(3);
        System.out.println("count : "+counter.getCount());
        counter.decrease(2);
        System.out.println("count : "+counter.getCount());

    }
}
