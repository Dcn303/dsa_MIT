package _01_Array;

public class _05_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 6, 9, 8};
        int k = 3;
        int si = 0;
        int ei = arr.length-1;
        System.out.println("Array before rotate ");
        for (int x : arr){
            System.out.print(x+ " -- ");
        }
        int[] res = rotateArray(arr, si, ei); // reverse whole array
        res = rotateArray(res, 0, k-1); // reverse 0 to k-1 index
        res = rotateArray(res,k, ei);

        System.out.println("Array after rotate");
        for (int n : res){
            System.out.print(n+" -- ");
        }
    }

    private static int[] rotateArray(int[] arr, int si, int ei) {
        while (si <= ei){
            int tmp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = tmp;
            si++;
            ei--;
        }
        return arr;
    }
}
