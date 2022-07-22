package review.ppt2;

import java.util.Scanner;

public class Cylinder {
    private static final double PI = 3.14;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] inputs = inputByUser();
        double volume = calculate(inputs);
        System.out.println("圆柱体的体积为" + volume);
    }

    /**
     * 用户输入圆柱体的高和底面半径，返回double数组
     * @return
     */
    private static double[] inputByUser() {
        System.out.println("请输入圆柱体的高");
        double height = sc.nextDouble();
        System.out.println("请输入圆柱体的底面半径");
        double radius = sc.nextDouble();
        return new double[]{height, radius};
    }

    private static double calculate(double[] inputs) {
        double height = inputs[0];
        double radius = inputs[1];
        double volume = PI * radius * radius * height;
        return volume;
    }


}
