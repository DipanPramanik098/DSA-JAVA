public class _02_spiralMatrix {
    public static void spiralPrint(int arr[][]){
        int total = arr.length *arr[0].length;
        // starting row
        int sr = 0, sc=0;
        int er = arr.length-1;
        int ec = arr[0].length-1;
        int count =0;
        while(count<total){
            // print top row
            for(int i=sc; i<=ec && count<total; i++){
                System.out.print(arr[sr][i]+" ");
                count++;
            }
            sr++;
            // print rightmost column
            for(int i=sr; i<=er && count<total; i++){
                System.out.print(arr[i][ec]+" ");
                count++;
            }
            ec--;
            // print bottom row
            if(sr<=er && count<total){
                for(int i=ec; i>=sc && count<total; i--){
                    System.out.print(arr[er][i]+" ");
                    count++;
                }
                er--;
            }
            // print leftmost column
            if(sc<=ec && count<total){
                for(int i=er; i>=sr && count<total; i--){
                    System.out.print(arr[i][sc]+" ");
                    count++;
                }
                sc++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiralPrint(arr);
    }    
}
