package review.ppt2;

import java.util.Scanner;

public class SumOfDigits {
    private static final int CAPACITY = 5;
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = inputByUser();
        System.out.println("您输入的数是" + num);
        int sum = algorithm(num);
        System.out.println("该数各个位上的和为" + sum);
    }

    private static int algorithm(int num) {
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        }while(num != 0);
        return sum;
    }

    private static int inputByUser() {
        while(true) {
            System.out.println("请输入一个"+ CAPACITY +"位的正整数");
            int number = sc.nextInt();
            if(number / (int) Math.pow(10, CAPACITY) > 9) {
                System.out.println("您输入的正整数过大，请重新输入");
                continue;
            }else if(number / (int) Math.pow(10, CAPACITY) == 0) {
                System.out.println("您输入的正整数较小，请重新输入");
                continue;
            }
            return number;
        }
    }


}
