public class _09_print_subarrays {
    public static void subarray(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // TC = O(n^3)
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};

        subarray(a);
        int n = a.length;
        int total = (n*(n+1))/2;
        System.out.println("Total = " + total);
    }
}
