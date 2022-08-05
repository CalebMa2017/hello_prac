package java03.example06;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 4, 7, 8, 9, 10, 23, 34, 34,34, 34,34, 34,34, 34, 36, 64};
        int index = Arrays.binarySearch(arr, 34);
        System.out.println(index);
        System.out.println("-----------------------------");
        int[] arr2 = new int[] {34, 4, 64, 7, 3, 10, 34, 23, 4, 4, 36, 9, 8};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-----------------------------");
        int[] arr3 = new int[] {3, 4, 4, 7, 8, 9, 10, 23,  34,34, 34, 36, 64};
        int[] copy = Arrays.copyOf(arr3, arr3.length + 5);
        int[] copy2 = Arrays.copyOf(arr3, arr3.length -5);
        int[] copy3 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));
        System.out.println("-----------------------------");
        System.out.println(Arrays.equals(arr3, copy3));
        System.out.println("-----------------------------");
        Arrays.fill(arr3, 888);
        System.out.println(Arrays.toString(arr3));
    }
}
