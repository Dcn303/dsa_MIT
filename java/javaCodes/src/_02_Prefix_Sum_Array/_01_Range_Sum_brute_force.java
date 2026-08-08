package _02_Prefix_Sum_Array;

public class _01_Range_Sum_brute_force {

    private static void rangeSum(int[] arr, int[][] queries){
        for (int i = 0; i < queries.length; i++){
            int l = queries[i][0], r = queries[i][1];
            int sum = 0;
            for (int j = l; j <= r; j++){
                sum+= arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] queries = {{4,8}, {6, 9}, {1, 3}, {0, 4}, {7,7}};
        rangeSum(arr, queries);
    }
}
