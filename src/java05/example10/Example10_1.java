package java05.example10;

public class Example10_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();
        outer.print();
        System.out.println("------------------------------");
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.method();
        System.out.println("------------------------------");
        outer.print2();
        outer.print3();
        outer.print4();
        System.out.println("-------------------------------");
        outer.print5();
        outer.print6(new Chicken() {
            @Override
            public void eat() {
                System.out.println("调用参数式匿名内部类1...");
            }
        }, new Product() {
            @Override
            public void work() {
                System.out.println("调用参数式匿名内部类2...");
            }
        }, "张三" , 23);

    }
}


