package Test;

import java.awt.*;

public class Te {
    public static void main(String[] args){
        Te1 n1 = new Te1();

        n1.test();
        int t = n1.test1(3);
        System.out.println(t);

        Rectangle box = new Rectangle(0,10,
                200,300);
        box.x = box.x +1;

        System.out.println( n1.test1(3) );
        n1.name = "li";
        n1.age = 10;
        System.out.println(n1.name);
        System.out.println(n1.age);
        Te1 n2 = new Te1();
        n2.name = "quentin";
        System.out.println(n2.name);
    }

}
