package _01_Array;

public class _01_Array_element_Count {
    public static void main(String[] args) {
        int[] arr = {-3, -2, 6, 8, 4, 8, 5};
        int max = Integer.MIN_VALUE;
        int count = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++){
            if (arr[i] > max){
                max = arr[i];
                count = 1;
            }
            else if (arr[i] == max){
                count++;
            }
        }
        System.out.println("Count of array element having atlest 1 greater than itself : "+(size-count));
    }
}
