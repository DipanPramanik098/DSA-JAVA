public class _03_searchInARotatedSortedArray {
    public static int find(int a[], int target, int si, int ei){
        if(si>ei) return -1;
        int mid = si+(ei-si)/2;
        if(a[mid] == target){
            return mid;
        }

        // line 1
        if(a[si]<=a[mid]){
            if(a[si]<=target && target<=a[mid]){
                // left
                return find(a,target, si,mid-1);
            }else{
                // right
                return find(a,target,mid+1, ei);

            }
        }else{
            // line 2
            if(a[mid]<=target && target<=a[ei]){
                // right
                return find(a,target,mid+1, ei);
            }else{
                return find(a,target,si,mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(find(a,target,0,a.length-1));
    }
}
