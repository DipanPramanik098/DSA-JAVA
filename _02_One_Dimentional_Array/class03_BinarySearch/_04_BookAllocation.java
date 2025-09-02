import java.util.Arrays;

public class _04_BookAllocation {
    public static void main(String[] args) {
        int pages [] = {12,64,67,90};
        int nos = 3; //no of student

        System.out.println(MinPage(pages, nos));
    }
    public static int MinPage(int [] pages , int nos){
        Arrays.sort(pages);

        int lo = 0;
        int hi = 0;
        for(int i=0;i<pages.length; i++){
            hi+=pages[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isPossible(pages,nos,mid)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int [] pages, int nos, int mid){
        int student = 1;
        int readPage = 0;
        for(int i=0; i<pages.length;i++){
            if(readPage + pages[i] <= mid){
                readPage += pages[i];
            }else{
                student++;
                readPage = pages[i];
            }

            if(student > nos) return false;
        }
        return true;
    }
}
