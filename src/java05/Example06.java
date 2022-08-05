package java05;

public class Example06 {
    public static void main(String[] args) {
        String s1 = "小飞";
        String s2 = "小飞";
        System.out.println(s1 == s2);
        String s3 = new String("小飞");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        Person p1 = new Person("关关", 18, "男");
        Person p2 = new Person("关关", 18, "男");
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(Integer.toHexString(p1.hashCode()));
    }
}

class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

   /* @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }*/

    public Person() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Person) {
            Person o = (Person) obj;
            if(!name.equals(o.getName())) return false;
            if(age!=o.getAge()) return false;
            if(!sex.equals(o.getSex())) return false;
            return true;
        }
        return false;
    }
}
