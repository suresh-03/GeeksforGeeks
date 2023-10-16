import java.util.ArrayList;

public class valueEqualToIndexValue{
        ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i+1 == arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}