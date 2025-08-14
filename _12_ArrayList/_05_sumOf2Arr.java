import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _05_sumOf2Arr {
    public static void main(String[] args) {
        int a[] =        {2,3,4,6};
        int [] b = {8,3,5,3,4,7,6};

        addNum(a, b);
    }

    public static void addNum(int a[], int []b){
        int i=a.length - 1;
        int j = b.length -1;
        int carry = 0;
        ArrayList<Integer>arr = new ArrayList<>();

        while(i>=0 && j>=0){
            int sum = a[i] + b[j] + carry;
            arr.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum = a[i] + carry;
            arr.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j>=0){
            int sum = b[j] + carry;
            arr.add(sum % 10);
            carry = sum / 10;
            j--;
        }

        Collections.reverse(arr);

        System.out.println(arr);
    }
}
