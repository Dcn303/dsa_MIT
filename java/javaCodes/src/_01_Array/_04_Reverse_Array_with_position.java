package _01_Array;

public class _04_Reverse_Array_with_position {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        int si = 3; // START INDEX
        int ei = 7; // END INDEX
        System.out.println("Array before reverse");
        for (int n : arr){
            System.out.print(n+" -- ");
        }
        int[] res = reversArrPosition(arr, si, ei);
        System.out.println("Array after reverse");
        for (int n : res){
            System.out.print(n+" -- ");
        }
    }

    private static int[] reversArrPosition(int[] arr, int si, int ei) {
        while (si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        return arr;
    }
}
