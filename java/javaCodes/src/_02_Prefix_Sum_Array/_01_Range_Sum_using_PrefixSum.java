package _02_Prefix_Sum_Array;

public class _01_Range_Sum_using_PrefixSum {

    public static void sumOfRange(int[] arr, int[][] queries){
        //generate prefix sum of the given array
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        //generate som of the respective query range
        int ans = 0;
        for (int i = 0; i < queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l == 0){
                ans = pf[r];
            }
            else {
                ans = pf[r] - pf[l-1];
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] queries = {{4,8}, {6, 9}, {1, 3}, {0, 4}, {7,7}};
        sumOfRange(arr, queries);
    }
}
