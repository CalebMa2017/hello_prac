package java03.example01;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        print(rows);
    }
    private static void print(int n) {
        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < i +1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}