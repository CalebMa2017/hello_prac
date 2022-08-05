package java03.example04;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {34, 4, 64, 7, 3, 10, 34, 23, 4, 4, 36, 9, 8};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
