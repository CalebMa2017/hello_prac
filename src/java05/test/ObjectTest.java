package java05.test;

import java.util.ArrayList;
import java.util.List;

public class ObjectTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog("Dog" + i, "红色", 8);
        }
        for (Dog d : dogs) {
            System.out.println(d);
        }
        System.out.println("----------------------------");
        List<Dog> dogList  = new ArrayList<>();
        dogList.add(dogs[2]);
        Dog dog = dogList.get(0);
        dog.setColor("白色");
        System.out.println(dogList);
        System.out.println("----------------------------");

        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
}

class Dog {
    private String name;
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}