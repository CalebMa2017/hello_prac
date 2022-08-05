package java04.example04;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        System.out.println("singleton11 = " + singleton11);
        System.out.println("singleton12 = " + singleton12);
        System.out.println(singleton11 == singleton12);
        System.out.println("---------------------------------------------------");
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        System.out.println("singleton11 = " + singleton21);
        System.out.println("singleton12 = " + singleton22);
        System.out.println(singleton21 == singleton22);
        System.out.println("---------------------------------------------------");
    }

}
