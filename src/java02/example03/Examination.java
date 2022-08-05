package java02.example03;

import java.util.Scanner;

public class Examination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试成绩");
        int score = sc.nextInt();
        System.out.println("您输入的成绩为" + score);
        char c = calculate(score);
        System.out.println("分数的评级为" + c);

    }

    public static char calculate(int score) {
        char c;
        switch (score / 10) {
            case 10:
            case 9:
                c = 'A';
                break;
            case 8:
                c = 'B';
                break;
            case 7:
                c = 'C';
                break;
            case 6:
                c = 'D';
                break;
            default:
                c = 'E';
        }
        return c;
    }
}
