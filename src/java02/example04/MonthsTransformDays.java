package java02.example04;

import java.util.Scanner;

public class MonthsTransformDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        while(true) {
            System.out.println("请输入1-12月中的任意一个月份");
            month = scanner.nextInt();
            if(month < 1 || month > 12) {
                System.out.println("您输入的有误请重新输入");
                continue;
            }
            break;
        }
        switch (month) {
            case 2:
                System.out.println("2月平年有28天, 闰年有29天");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月有31天");
                break;
            default:
                System.out.println(month + "月有30天");
        }
    }
}
