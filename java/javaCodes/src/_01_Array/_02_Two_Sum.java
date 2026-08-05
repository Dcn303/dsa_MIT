package _01_Array;

public class _02_Two_Sum {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 6, 8};
        int k = 10;
        boolean res = twoSum(arr, k);
        System.out.println("is the pair exist ? \n"+res);
    }

    private static boolean twoSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if ((arr[i]+ arr[j]) == k){
                    return true;
                }
            }
        }
        return  false;
    }
}
