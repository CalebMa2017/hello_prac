package java07;

import org.junit.Test;

public class Example01 {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println("-----------------------");
        char[] chars = str.toCharArray();
        for(char c : chars) {
            System.out.println(c);
        }
        String str2 = new String(chars);
        System.out.println(str2);
        System.out.println(str == str2);
        String str3 = new String(chars, 0, 5);
        System.out.println(str3);
        System.out.println(str.startsWith("abc"));
        System.out.println(str.startsWith("abc", 1));
    }
    @Test
    public void testFn1() {
        String str = "abcdefg,hijklmn,opq,rst,uvw,xyz";
//        String[] split = str.split(",", 7);
//        for (String s : split) {
//            System.out.println(s);
//        }
         boolean st= str.contains("");
        System.out.println(st);
        int index = str.indexOf("");
        System.out.println(index);
    }

}
