import java.util.PriorityQueue;

public class _05_NearbyCars {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int index;

        public Point(int x, int y, int distSq, int index){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.index = index;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }

    }

    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue <Point> pq = new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int distSq = points[i][0]*points[i][0] + points[i][1] * points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distSq,i));
        }

        for(int i=0;i<k; i++){
            System.out.println("Car -> "+pq.remove().index);
        }
    }
}
