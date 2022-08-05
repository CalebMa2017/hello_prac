package java04.example01;

public class ValueDemo01 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        change(10);
        System.out.println("x = " + x);
    }
    private static void change(int mx) {
        mx = 20;
    }
}
