package java05;

import org.junit.Test;

public class Example07 {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        a %= b++ ;
        System.out.println(a);
        System.out.println(b);
    }
    @Test
    public void testFn() {
        String str2 = null;
        String str1 = "hello";
        System.out.println(str1.equals(str2));
    }
}
