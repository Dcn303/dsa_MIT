package _03_Carry_forward;

public class _01_Count_Pairs {

    private static int countPair(String str, char x, char y){
        char[] cArr = str.toCharArray();
        int n = cArr.length;
        int count  = 0;
        int res = 0;
        for (int i = n-1; i>=0; i--){
            if (cArr[i] == 'g'){
                count++;
            } else if (cArr[i] == 'a') {
                res += count;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str= "adgagagfg";
        char x = 'a';
        char y = 'g';
        int count = countPair(str, x, y);
        System.out.println("Total pair of "+x+" & "+y+" is "+count);
    }
}
