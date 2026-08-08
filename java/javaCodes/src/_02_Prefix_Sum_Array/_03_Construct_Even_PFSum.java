package _02_Prefix_Sum_Array;

public class _03_Construct_Even_PFSum {

    private static int[] evenPrefixConst(int[] arr){
        int[] pf = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (i == 0)
                pf[i] = arr[i];
            else if (i % 2 == 0){
                pf[i] = arr[i] + pf[i-1];
            }
            else
                pf[i] = pf[i-1];
        }
        return pf;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 3, 1, 4, 3, 2, -1};
        int[] res = evenPrefixConst(arr);
        System.out.println("Even prefix sum : ");
        for (int n : res)
            System.out.print(n+" ");
    }
}
