public class _07_firstOccurance {
    public static int firstOccurance(int a[], int i, int key){
        if(i==a.length-1) return -1;
        if(a[i]==key) return i;
        return firstOccurance(a,i+1,key);
    }

    public static int lastOccurance(int a[], int i, int key){
        if(i==a.length-1) return -1;

        int isFound = lastOccurance(a, i+1, key);
        if(isFound==-1 && a[i]==key) return i;

        return isFound;
    }

    public static void main(String[] args) {
        int a[] = {3,7,9,5,11,7,5};
        System.out.println(firstOccurance(a, 0, 7));
        System.out.println(lastOccurance(a, 0, 7));
    }    
}
