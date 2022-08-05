package java02.example02;


import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

public class AlphabeticJudgment {
    public static void main(String[] args) throws IOException {
        System.out.println("请您输入一个字符");
        char c = (char) System.in.read();
        System.out.println("你输入的字符为" + c);
        if(c >= 65 && c <= 90) {
            System.out.println("你输入的字符为大写字母");
        }else if( c >=97 && c <= 122) {
            System.out.println("你输入的字符为小写字母");
        }else {
            System.out.println("你输入的字符不是字母");
        }
    }

    @Test
    public void testFn() {
        int num = (int)'A';
        int numend = (int)'Z';
        int num2 = (int)'a';
        int num2end = (int)'z';
        System.out.println("num = " + num);
        System.out.println("numend = " + numend);
        System.out.println("num2 = " +num2);
        System.out.println("num2end = " + num2end);

    }
}
