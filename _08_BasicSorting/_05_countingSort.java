public class _05_countingSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void countingSort(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(maxi,arr[i]);
        }

        int count[] = new int[maxi + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        print(arr);

        System.out.println();

        countingSort(arr);

        print(arr);
    }    
}
