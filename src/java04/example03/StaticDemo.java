package java04.example03;

public class StaticDemo {
    public static String hello = "hello";
    private String name;
    private int age;

    public StaticDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StaticDemo() {
    }

    public static String getHello() {
        return hello;
    }

    public static void setHello(String hello) {
        StaticDemo.hello = hello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StaticDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
