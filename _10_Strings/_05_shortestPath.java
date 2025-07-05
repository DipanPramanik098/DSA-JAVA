public class _05_shortestPath {
    public static int Distance(String str){
        // x1 & x2 is initial position => 0
        int x2=0,y2=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y2++;
            }else if(str.charAt(i) == 'S'){
                y2--;
            }else if(str.charAt(i) == 'E'){
                x2++;
            }else{
                x2--;
            }
        }

        int dis = (int) Math.sqrt(Math.pow(x2-0, 2) + Math.pow(y2-0, 2));
        return dis;
    }
    public static void main(String[] args) {
        // sqrt(pow(x2-x1) + pow(y2-y1)

        String str = "WNEENESENNN";

        // east  ->
        // west  <-
        // north  ^
        // south  v

        System.out.println("Distance = " + Distance(str));
    }    
}
