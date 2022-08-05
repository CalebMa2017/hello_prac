package java04.example01;

public class ValueDemo03 {
    public static void main(String[] args) {
        String name = "飞飞";
        System.out.println("name = " + name);
        change(name);
        System.out.println("name = " + name);
    }

    private static void change(String sname) {
        sname = "备备";
    }
}
