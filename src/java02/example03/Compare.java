package java02.example03;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要比较的两个数");
        int[] nums = new int[2];
        for (int i = 0; i < 2; i++) {
            nums[i] = Integer.parseInt(scanner.next());
        }
        int a = nums[0];
        int b = nums[1];
        System.out.println("待比较的第一个数是" + a);
        System.out.println("待比较的第二个数是" + b);
        if(a == b) {
            System.out.println("两个数相等");
        }else if (a > b) {
            System.out.println("第一个数要比第二个数大");
        }else {
            System.out.println("第一个数要比第二个数小");
        }
    }
}
