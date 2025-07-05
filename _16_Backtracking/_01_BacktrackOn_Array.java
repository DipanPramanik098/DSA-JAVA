
public class _01_BacktrackOn_Array {
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void changeArr(int a[], int i, int val){
        // base case
        if(i==a.length){
            print(a);
            return;
        }
        // work
        a[i]=val;
        // recursion call
        changeArr(a, i+1, val+1);
        // backtrack
        a[i]-=2;
    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        changeArr(arr,0,1);
        print(arr);
    }    
}
