package review.ppt2;

import java.util.Scanner;

public class DaysCalculation {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int days = inputByUser();
        int[] weeksAndRemains = calculate(days);
        int weeks = weeksAndRemains[0];
        int remains = weeksAndRemains[1];
        if(remains == 0) {
            System.out.println(days + "天等价于" + weeks + "周");
        }else {
            System.out.println(days + "天等价于" + weeks + "周余" + remains + "天");
        }
    }
    private static int inputByUser() {
        System.out.println("请输入总天数");
        int days = scanner.nextInt();
        System.out.println("你输入的天数为" + days);
        return days;
    }

    private static int[] calculate(int days) {
        int weeks = days / 7;
        int remains = days % 7;
        return new int[]{weeks, remains};
    }
}
