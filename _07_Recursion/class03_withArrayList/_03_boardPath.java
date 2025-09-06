
import java.util.ArrayList;


public class _03_boardPath {
    public static ArrayList<String> getBoardPath(int curr, int target){
        if(curr == target){
            ArrayList <String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(curr > target){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> myRes = new ArrayList<>();
        for(int dice =1; dice<=6; dice++){
            ArrayList<String> recRes = getBoardPath(curr+dice, target);

            for(String rrs : recRes){
                myRes.add(dice + rrs);
            }
        }
        return myRes;
    }
    public static void main(String[] args) {
        System.out.println(getBoardPath(0, 10));
        System.out.println(getBoardPath(0, 10).size());
    }
}
