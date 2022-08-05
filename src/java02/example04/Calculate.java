package java02.example04;


import org.junit.Test;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入运算表达式");
        String expression = scanner.nextLine();
        char[] chars = expression.toCharArray();
        String operation = "";
        for(char c: chars) {
            if(!(c >= '0' && c <= '9') && c != ' ') {
                operation = c + "";
                break;
            }
        }
        System.out.println("当前表达式的操作符是" + operation);
        switch (operation) {
            case "+":
                System.out.println("当前表达式是加法运算");
                break;
            case "-":
                System.out.println("当前表达式是减法运算");
                break;
            case "*":
            case "x":
                System.out.println("当前表达式是乘法运算");
                break;
            case "/":
                System.out.println("当前表达式是除法运算");
                break;
            default:
                System.out.println("当前系统程序暂不支持识别当前表达式的运算");
                break;
        }
    }
    @Test
    public void testFn() {
        System.out.println((int)'0');
        System.out.println((int)'9');
    }
}
