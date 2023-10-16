public class palindromicArray {
    public static int palinArray(int[] a, int n)
    {
           //add code here.
           for(int i = 0; i < n; i++){
               int temp = a[i];
               int ans = 0;
               while(temp != 0){
                   int mod = temp % 10;
                   ans = ans * 10 + mod;
                   temp /= 10;
               }
               if(ans != a[i]) return 0;
           }
           return 1;
    }
}
