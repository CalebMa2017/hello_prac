package java02.example03;

import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(true) {
            System.out.println("请您进行选择 1.在家 2.外出");
            a = sc.nextInt();
            if(a == 1) {
                System.out.println("哈哈哈，在家你能呆着干好多事");
                break;
            }else if(a == 2) {
                System.out.println("哈哈哈，出去玩玩挺好的");
                break;
            }else {
                System.out.println("你输入的有误，请重新输入");
            }
        }
        int b = 0;
        if(a == 1) {
            while(true) {
                System.out.println("请选择在家的计划 1.看电影 2.玩游戏");
                b = sc.nextInt();
                if(b == 1) {
                    System.out.println("一定要找一个评分高的看哦");
                    break;
                }else if (b == 2) {
                    System.out.println("玩游戏的时候别忘记时间了哦");
                    break;
                }else {
                    System.out.println("您输入的有误，请重新输入");
                }
            }
        }else if(a == 2){
            while(true) {
                System.out.println("请选择外出的计划 1.逛街 2.逛公园");
                b = sc.nextInt();
                if(b == 1) {
                    System.out.println("你可以卖一些衣服");
                    break;
                }else if(b == 2) {
                    System.out.println("公园的风景也很美啊");
                    break;
                }else {
                    System.out.println("您输入的有误，请重新输入");
                }
            }
        }else {
            throw new RuntimeException("程序出错，强制退出");
        }
    }
}
