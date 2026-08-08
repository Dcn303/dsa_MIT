package _02_Prefix_Sum_Array;

public class _05_Special_Index {

    private static int specialIndex(int[] arr){
        //PrefixArray Construct here even and odd
        //1. even prefix sum
        int[] pfEven = new int[arr.length];
        for( int i = 0; i <arr.length; i++){
            if (i == 0)
                pfEven[i] = arr[0];
            else if (i % 2 == 0)
                pfEven[i] = pfEven[i-1] + arr[i];
            else
                pfEven[i] = pfEven[i-1];
        }
        //2. odd prefix sum
        int[] pfOdd = new int[arr.length];
        pfOdd[0] = arr[0];
        for (int i = 1; i <arr.length; i++){
            if (i % 2 != 0){
                pfOdd[i] = arr[i]+pfOdd[i-1];
            }
            else {
                pfOdd[i] = pfOdd[i-1];
            }
        }
        //even and odd pf construction done
        //Teven = pfEven[0,i] + pfOdd[i+1,n-1]
        //Todd = pfOdd[0,i] + pfEven[i+1,n-1]
        // now lets count number of special Index
        int count = 0;
        int TotalEven = 0, TotalOdd= 0;
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                TotalEven = pfOdd[arr.length-1] - pfOdd[i];
                TotalOdd = pfEven[arr.length-1] - pfEven[i];
            }
            else {
                TotalEven = pfEven[i - 1] + pfOdd[arr.length - 1] - pfOdd[i];
                TotalOdd = pfOdd[i - 1] + pfEven[arr.length - 1] - pfEven[i];
            }
            if (TotalOdd == TotalEven){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 6, -2};
        int res = specialIndex(arr);
        System.out.println("The number of special index in the given array : "+res);
    }
}
