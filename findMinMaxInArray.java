import java.util.Arrays;

class Pair{
    long first,second;
    public Pair(long first,long second){
        this.first = first;
        this.second = second;
    }
}

public class findMinMaxInArray {
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        return new Pair(a[0],a[a.length-1]);
    }
}
