package java03.example02;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的数");
        int num = sc.nextInt();
        if(isExist(num)) {
            System.out.println("存在该数");
        }else {
            System.out.println("不存在该数");
        }
    }
    private static final int[] library = {83, 32, 324, 5, 4, 1, 666, 92};
    private static boolean isExist(int num) {
        for(int per: library) {
            if(per == num) return true;
        }
        return false;
    }
}
