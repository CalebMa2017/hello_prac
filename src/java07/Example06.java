package java07;

import java.util.Arrays;
import java.util.Comparator;

public class Example06 {
    public static void main(String[] args) {
        Pig[] pigs = new Pig[] {new Pig("佩奇" , 3), new Pig("猪爸爸", 30), new Pig("猪妈妈", 27)};
        System.out.println(Arrays.toString(pigs));
        Arrays.sort(pigs, new PigComparator());
        System.out.println(Arrays.toString(pigs));
    }
}

class PigComparator implements Comparator<Pig> {
    @Override
    public int compare(Pig o1, Pig o2) {
        return o1.getAge() - o2.getAge();
    }
}
class Pig /*implements Comparable<Pig>*/{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Pig() {
    }

    public Pig(String name, int age) {
        this.name = name;
        this.age = age;
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

    /*@Override
    public int compareTo(Pig o) {
        return this.age - o.getAge();
    }*/
}
