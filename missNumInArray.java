import java.util.Arrays;

public class missNumInArray {
        int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] != i+1){
                return i+1;
            }
        }
        return n;
    }
}
