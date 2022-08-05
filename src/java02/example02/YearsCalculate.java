package java02.example02;

import java.util.Scanner;

public class YearsCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();
        System.out.println("您输入的年份为" + year);
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("您输入的年份为闰年");
        }else {
            System.out.println("您输入的年份不是闰年");
        }
    }
}
