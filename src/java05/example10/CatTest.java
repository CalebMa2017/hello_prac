package java05.example10;

import org.junit.Test;

public class CatTest {
    @Test
    public void testFn() {
        Cat c = new Cat() {
//            public static String name = "家猫";
            @Override
            public void eat() {
                System.out.println("家猫在吃食");
            }
        };
    }
    Cat c2 = new Cat() {
//        public static String name = "家猫";
        @Override
        public void eat() {
            System.out.println("家猫在吃食");
        }
    };
    Cat2 cat2 = new Cat2() {
        public String name = "hhh";
    };
}
class Cat2 {
    public void eat() {
        System.out.println("Cat2正在吃食");
    }
}
abstract class Cat {
    public abstract void eat();
}

class HomeCat extends Cat{
    public static String name = "家猫";
    @Override
    public void eat() {
        System.out.println("家猫在吃食");
    }
}