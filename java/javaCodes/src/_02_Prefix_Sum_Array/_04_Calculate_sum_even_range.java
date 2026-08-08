package _02_Prefix_Sum_Array;

public class _04_Calculate_sum_even_range {
    private static int sumEven(int[] arr, int l, int r){
        int[] pf = new int[arr.length];
        for (int i = 0 ;i < arr.length; i++){
            if (i == 0){
                pf[i] = arr[i];
            }
            else if(i % 2 == 0) {
                pf[i] = arr[i] + pf[i-1];
            }
            else {
                pf[i] = pf[i-1];
            }
        }
        int sum = 0;
        if (l == 0){
            sum = pf[r];
        } else {
            sum = pf[r]-pf[l-1];
        }
        return sum;
    }
    private static void rangeSum(int[] arr, int[][] q){

        for (int i = 0; i < q.length; i++){
            int res = sumEven(arr, q[i][0], q[i][1]);
            System.out.print(res+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -2, 8, 6, 2, 1, 3};
        int[][] queries = {{2,6}, {3, 7}};
        rangeSum(arr, queries);
    }
}
