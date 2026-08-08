package _02_Prefix_Sum_Array;

public class _02_Equilibrium_Index_prefixSum {
    private static int countEquilibriumIDX(int[] arr){
        int count  = 0;
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++){
            left = (i == 0)? 0 : pf[i-1];
            right = (i == arr.length-1) ? 0 : pf[arr.length-1] - pf[i];
            if (left == right){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int res  = countEquilibriumIDX(arr);
        System.out.println("Number of equilibrium index : "+res);
    }
}
