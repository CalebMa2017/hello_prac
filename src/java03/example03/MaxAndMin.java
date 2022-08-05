package java03.example03;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 8, 3, 4, 29, 34, 43, 5, 63, 1};
        int maxValue = getMaxValue(array);
        int minValue = getMinValue(array);
        System.out.println("数列为" + Arrays.toString(array));
        System.out.println("最大值是" + maxValue);
        System.out.println("最小值是" + minValue);
    }


    private static int getMinValue(int[] array) {
        if (array.length <= 0) throw new RuntimeException("数组中没有元素");
        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    private static int getMaxValue(int[] array) {
        if (array.length <= 0) throw new RuntimeException("数组中没有元素");
        int max = array[0];
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    private static int[] getMaxValueAndMinValue(int[] array) {
        if (array.length <= 0) throw new RuntimeException("数组中没有元素");
        int max = array[0];
        int min = array[0];
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
        }
        return new int[]{max, min};
    }
}
