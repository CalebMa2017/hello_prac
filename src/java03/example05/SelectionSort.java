package java03.example05;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {34, 4, 64, 7, 3, 10, 34, 23, 4, 4, 36, 9, 8};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
