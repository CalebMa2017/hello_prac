package java02.example05;

/**
 * 打印输出0~200之间能被7整除但不能被4整除的所有整数
 */
public class PrintProblem {
    public static void main(String[] args) {
        System.out.println("能被7整除，但不能被4整除的数有：");
        for (int i = 0; i < 200; i++) {
            if(judge(i)) System.out.println(i);
        }
    }
    private static boolean judge(int n) {
        if(n % 7 == 0 && n % 4 != 0) return true;
        return false;
    }
}
