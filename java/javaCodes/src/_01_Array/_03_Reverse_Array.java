package _01_Array;

public class _03_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 7, 6, -2, 7, 8, 10};
        System.out.println("Array before reverse : ");
        for (int i : arr){
            System.out.print(i+" = ");
        }

        int[] res = reverseArray(arr);
        System.out.println("Array after reverse : ");
        for (int i : res){
            System.out.print(i+" = ");
        }
    }

    private static int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return arr;
    }
}
