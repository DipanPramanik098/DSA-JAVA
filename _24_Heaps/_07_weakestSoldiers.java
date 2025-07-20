import java.util.PriorityQueue;

public class _07_weakestSoldiers {
    static class Row implements Comparable<Row>{
        int soldier;
        int index;
        public Row(int soldier, int index){
            this.soldier = soldier;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.index - r2.index;
            }else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};

        int k=2;

        PriorityQueue<Row>pq = new PriorityQueue<>();


        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k; i++){
            System.out.println("Row "+pq.remove().index);
        }
    }
}
