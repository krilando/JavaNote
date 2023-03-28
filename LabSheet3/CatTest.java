package LabSheet3;

import java.awt.*;

/**
 * Title      : CatTest.java
 * Description: This class contains the test class for Cat.
 * Copyright  : Copyright (c) 2006 - 2023
 * @author  Laurissa Tokarchuk
 * @version 1.0
 * @author  Paula Fonseca
 * @version 1.4
 * @author Yuchong Chang
 * @version 1.5
 */
public class CatTest {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        // ii)
        myCat.setName("Napoleon");
        myCat.setSpeed(300);
        System.out.println(myCat.getName()+" "+myCat.getSpeed());

        // iii)
        Cat cat = new Cat("Napoleon",true, 300,"short",Color.ORANGE);

        // iv)
        Cat cat1 = new Cat("Tom",true,500,"short",Color.BLACK);
        Cat cat2 = new Cat("Moggy",false,400,"long",Color.WHITE);
        System.out.println("the "+cat1.getName()+" and "+cat1.getfurType()+" of cat1.");
        cat1.run(10, false);
        System.out.println("the "+cat2.getName()+" and "+cat2.getfurType()+" of cat2.");
        cat2.run(5,true);
    }
}