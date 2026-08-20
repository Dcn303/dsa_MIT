package _06_Sliding_Window;

public class _01_PrintStartAndEndIdx {

    public static void printStartNEndIdx(int[] arr, int size){
        int start = 0, end = size-1;
        while (start <= arr.length-size){
            System.out.println(arr[start]+" - "+arr[end]);
            start++;
            end++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, -1, 6, 7, 8, 9, 3, 2, -1, 4};
        int size = 3;
        printStartNEndIdx(arr, size);
    }
}
