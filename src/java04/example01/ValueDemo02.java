package java04.example01;

public class ValueDemo02 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("age = " + duck.age);
        change(duck);
        System.out.println("age = " + duck.age);
    }

    private static void change(Duck duck) {
        duck.age = 5;
    }
}

class Duck {
    int age = 3;
}