package task2;

import java.util.Arrays;

public class ArrayAfterFour {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(Arrays.toString(func1(arr1)));
    }
    public static int[] func1(int[] inArr) {
        for (int i = inArr.length - 1; i >= 0; i--) {
            if (inArr[i] == 4) {
                return Arrays.copyOfRange(inArr, i + 1, inArr.length);
            }
        }
        throw new RuntimeException("В исходном массиве нет 4");
    }
}
