package _02_Prefix_Sum_Array;

public class _02_Equilibrium_brute_force {

    public static void countEquilibrium(int[] arr){
//        int left = 0, right = 0, count = 0;
//        for (int i = 0; i < arr.length; i++){
//            if (i == 0)
//                left = 0;
//            else if (i == arr.length-1)
//                right = 0;
//            else {
//                for (int j = 0; j <i; j++){
//                    if
//                    left += arr[j];
//                }
//                for (int j = i+1; j < arr.length; j++){
//                    right += arr[j];
//                }
//            }
//            if (left == right){
//                count++;
//            }
//        }
//        System.out.println("Number of Equilibrium Index : "+count);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left += arr[j];
            }

            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }

            if (left == right) {
                count++;
            }
        }

        System.out.println("Number of Equilibrium Index : " + count);
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        countEquilibrium(arr);
    }
}
