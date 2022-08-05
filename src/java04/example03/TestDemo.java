package java04.example03;

public class TestDemo {
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.hello = "world";
        StaticDemo afterStaticDemo = new StaticDemo();
        System.out.println(afterStaticDemo);
        System.out.println(afterStaticDemo.hello);
    }
}
