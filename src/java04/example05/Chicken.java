package java04.example05;

public class Chicken {
    private String name;
    private String color;
    private int age;
    private int id;

    public Chicken() {
    }

    public Chicken(String name, String color, int age, int number) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.id = number;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", number=" + id +
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
