package java04.example01;

public class ValueDemo04 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("name = " + person.name);
        change(person);
        System.out.println("name = " + person.name);
    }

    private static void change(Person person) {
        person.name = "飞飞";
    }
}
class Person {
    String name = "备备";
}
