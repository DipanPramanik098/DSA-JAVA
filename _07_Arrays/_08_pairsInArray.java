public class _08_pairsInArray {
    public static void pair(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
    }
    // Time Complexity = O(n^2);
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        pair(a);
        int n = a.length;
        int total_pair = (n*(n-1))/2;
        System.out.println("total_pair = "+total_pair);
    }    
}
