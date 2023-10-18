import java.util.ArrayList;

public class maxOfAllSubArraySizeK {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n-k; i++){
            int max = arr[i];
            for(int j = i; j < i+k; j++){
                max = Math.max(max,arr[j]);
            }
            list.add(max);
        }
        return list;
    }
}
