package _03_Carry_forward;

public class _02_Leaders_in_Array {

    private static int leaderCount(int[] arr){
        int max = arr[arr.length-1];
        int count = 1;
        for (int i = arr.length-2; i>= 0; i--){
            if (arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {15, -1, 7, 2, 5, 4, 2, 3};
        int count = leaderCount(arr);
        System.out.println("The number of leaders in the given array is "+count);
    }
}
