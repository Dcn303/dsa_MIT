package _03_Carry_forward;

import java.util.Arrays;

public class _03_Closest_min_max {
    private static int closestMinMaxLen(int[] arr){
        int min = arr[0], max = arr[0];
        int minIdx = -1, maxIdx = -1;
        int ans = arr.length;
        //1. find maximum and minimum
        for (int n : arr){
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        //2. find minimum distance
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                minIdx = i;
                if (maxIdx != -1){
                    ans = Math.min(ans, i - maxIdx + 1);
                }
            }
            if (arr[i] == max){
                maxIdx = i;
                if (minIdx != -1){
                    ans = Math.min(ans, i - minIdx + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
//        System.out.println();
        int res = closestMinMaxLen(arr);
        System.out.println(res);
    }
}
