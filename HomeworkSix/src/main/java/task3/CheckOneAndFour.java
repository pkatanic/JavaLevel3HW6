package task3;

import java.util.Arrays;

public class CheckOneAndFour {
    public static void main(String[] args) {
        int[] arr = {1,1,4,4,4,4,1,1,4,1,4,4,1};

        System.out.println(Arrays.toString(arr));
        System.out.println(checkArray(arr));
    }

    public static boolean checkArray(int[] mas) {
        boolean one = false;
        boolean four = false;

        for (int i = 0; i < mas.length; i++) {
            if (one & four) break;
            if (mas[i] == 1) one = true;
            if (mas[i] == 4) four = true;
        }

        return (one && four)?(true):(false);
    }
    public static boolean process(int[] arrIn) {
        boolean one = false;
        boolean four = false;
        for (int i: arrIn) {
            if(i != 1 && i!=4) throw new RuntimeException("invalid value");
            if(i == 1) one = true;
            if(i == 4) four = true;
        }
        return one && four;
    }
}
