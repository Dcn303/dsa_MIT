package _04_SubArray;

public class _03_Sum_of_All_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int total = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++){
            int count = (i + 1) * (size - 1);
            total += arr[i] * count;
        }
        System.out.println("Sum of all sub arrays : "+total);
    }
}
