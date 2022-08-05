package java03.example02;

import java.util.Scanner;

public class ProgrammerCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][3];
        int[] sums = new int[3];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入" + (i+1)+"班的程序大赛成绩，共三名同学");
            for (int j = 0; j < scores[i].length; j++) {
                int score = scanner.nextInt();
                scores[i][j] = score;
                sums[i] += score;
            }
        }
        System.out.println("您输入的成绩如下");
        for(int i = 0; i < scores.length; i++) {
            System.out.print((i+1)+"班的成绩为: ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < scores.length; i++) {
            double average = sums[i] * 1.0 / scores[i].length;
            System.out.printf((i+1)+"班的平均值是%.2f", average);
            System.out.println();
        }
    }
}
