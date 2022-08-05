package java06;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(div(10, 0));

        
    }

    public static int div(int a, int b) {
        try {
//            int c = a / b;
            return 4;
        }catch (Exception e){
            System.out.println("通用的捕获异常");
            return -1;
        }finally {
            System.out.println("异常的最终执行，无论有无异常都需要执行");
            return -2;
        }
    }
}
