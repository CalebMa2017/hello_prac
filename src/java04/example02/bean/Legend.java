package java04.example02.bean;

public class Legend {
    private String name;
    private Integer age;
    private Weapon weapon;
    public Legend() {
    }
    public Legend(String name, Integer age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }
    public Legend(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

//    @Override
//    public String toString() {
//        return "Legend{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", weapon=" + weapon +
//                '}';
//    }
}
