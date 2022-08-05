package java05.example10;

import java.util.zip.CheckedInputStream;

public class Outer {

    public void print() {
        int x = 10; //在JDK1.8之后，被方法内部类使用的变量必须被final修饰，若没有显式修饰，则默认为final修饰
//        x ++;

        class Inner1 {
            public void method() {
                System.out.println("方法内部类调用方法" + x);
            }
        }

        Inner1 inner1 = new Inner1();
        inner1.method();

    }

    public void print2() {
        Inner inner = new Inner();
        inner.method();
    }


    class Inner {
        public void method() {
            System.out.println("成员内部类方法被调用");
        }
    }

    private static int age = 5;
    static class Inner2 {

        public void method() {
            System.out.println("调用静态内部类方法" + age);
        }
    }

    public void print3() {
        class Chichen2 extends Chicken{
            @Override
            public void eat() {
                System.out.println("小鸡在吃食");
            }
        }
        Chicken c = new Chichen2();
        c.eat();
    }

    public void print4() {
        Chicken c2 = new Chicken() {
            @Override
            public void eat() {
                System.out.println("小鸡在吃食...");
            }
        };
        c2.eat();
    }

    public void print5() {
        Product p =  new Product() {
            @Override
            public void work() {
                System.out.println("电脑正在工作...");
            }
        };
        p.work();
    }
    public void print6(Chicken chicken, Product product, String name, int age) {
        chicken.eat();
        product.work();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
abstract class Chicken {
    public abstract void eat();
}

interface Product {
    void work();
}
