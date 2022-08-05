package java03.example07;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExcelGame {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static String[] userRedBalls = {"", "", "", "", "", ""};
    private static String[] systemRedBalls = {"", "", "", "", "", ""};
    private static String userBlueBall;
    private static String systemBlueBall;

    public static void main(String[] args) {
        System.out.println("欢迎来到双色球游戏");
        boolean b = true;
        while (b) {
            System.out.println("请输入您要购买彩票的形式: 1.机选 2.手选");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("正在生成您的号码...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 6; i++) {
                        int redNum = random.nextInt(33) + 1;
                        String redNumStr = null;
                        if (redNum < 10)
                            redNumStr = "0" + redNum;
                        else
                            redNumStr = String.valueOf(redNum);
                        if(Arrays.binarySearch(userRedBalls, redNumStr) >= 0) {
                            i--;
                            continue;
                        }else {
                            userRedBalls[i] = redNumStr;
                        }
                    }
                    int blueNum = random.nextInt(16) + 1;
                    if (blueNum < 10)
                        userBlueBall = "0" + blueNum;
                    else
                        userBlueBall = String.valueOf(blueNum);
                    b = false;
                    break;
                case 2:
                    System.out.println("请输入您选取的红球号码");
                    for (int i = 0; i < 6; i++) {
                        userRedBalls[i] = scanner.next();
                    }
                    System.out.println("请输入您选取的蓝球号码");
                    userBlueBall = scanner.next();
                    b = false;
                    break;
                default:
                    System.out.println("您输入的有误请重新输入");
            }
        }
        Arrays.sort(userRedBalls);
        printInfo(1, userRedBalls, userBlueBall);
        systemCreatesNums();
        Arrays.sort(systemRedBalls);
        printInfo(2, systemRedBalls, systemBlueBall);
        evaluate();

    }

    private static int evaluate() {
        int redEqual = 0;
        int blueEqual = 0;

        if (userBlueBall.equals(systemBlueBall)) blueEqual++;
        for (String userRedBall : userRedBalls) {
            for (String systemRedBall : systemRedBalls) {
                if (userRedBall.equals(systemRedBall)) {
                    redEqual++;
                }
            }
        }
        if(redEqual == 6 && blueEqual== 1) {
            System.out.println("恭喜您中了一等奖");
            System.out.println("奖金数额过大，具体奖金数额请看说明");
            return 1;
        }else if(redEqual == 6 && blueEqual == 0) {
            System.out.println("恭喜您中了二等奖");
            System.out.println("该注奖金为当期高等奖金的30%");
            return 2;
        }else if(redEqual == 5 && blueEqual == 1) {
            System.out.println("恭喜您中了三等奖");
            System.out.println("该注奖金为3000元");
            return 3;
        }else if(redEqual + blueEqual == 5) {
            System.out.println("恭喜您中了四等奖");
            System.out.println("该注奖金为200元");
            return 4;
        }else if(redEqual + blueEqual == 4) {
            System.out.println("恭喜您中了五等奖");
            System.out.println("该注奖金为10元");
            return 5;
        }else if(redEqual < 3 && blueEqual == 1) {
            System.out.println("恭喜您中了六等奖");
            System.out.println("该注奖金为5元");
            return 6;
        }else {
            System.out.println("对不起，您没中奖，再接再厉");
        }
        return 0;
    }

    /**
     * 打印号码信息, 状态码 1代表用户, 2代表系统
     *
     * @param reds
     * @param blue
     */
    private static void printInfo(int status, String[] reds, String blue) {
        switch (status) {
            case 1:
                System.out.print("您的中奖号码为:");
                break;
            case 2:
                System.out.print("本期中奖号码为:");
                break;
            default:
                throw new RuntimeException("系统错误, 强制退出");
        }
        for (int i = 0; i < reds.length; i++) {
            System.out.print(" " + reds[i]);
        }
        System.out.println(" + " + blue);
    }

    /**
     * 系统创建中奖号码
     */
    private static void systemCreatesNums() {
        System.out.println("正在生成中奖号码...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 6; i++) {
            int redNum = random.nextInt(33) + 1;
            String redNumStr = null;
            if (redNum < 10)
                redNumStr = "0" + redNum;
            else
                redNumStr = String.valueOf(redNum);
            if(Arrays.binarySearch(systemRedBalls, redNumStr) >= 0 ) {
                i--;
                continue;
            }else {
                systemRedBalls[i] = redNumStr;
            }
        }
        int blueNum = random.nextInt(16) + 1;
        if (blueNum < 10)
            systemBlueBall = "0" + blueNum;
        else
            systemBlueBall = String.valueOf(blueNum);
    }
}
