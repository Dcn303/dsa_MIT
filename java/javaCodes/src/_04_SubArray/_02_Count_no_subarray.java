package _04_SubArray;

public class _02_Count_no_subarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        int size = arr.length;
        count = size * (size + 1) /2 ;
        System.out.println("Number of subarray of the given array is "+count);
    }
}
