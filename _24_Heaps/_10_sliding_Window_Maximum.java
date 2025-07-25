import java.util.PriorityQueue;

public class _10_sliding_Window_Maximum {

    static class Pair implements Comparable<Pair>{
        int val,index;
        public Pair(int val, int index){
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2){
            // descending
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;

        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair>pq = new PriorityQueue<>();

        // first window
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val;

        for(int i=k; i<arr.length; i++){
            while(pq.size()>0 && pq.peek().index <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        // print res 
        for(int i=0; i<arr.length; i++){
            System.out.println(res[i]);
        }
    }
}
