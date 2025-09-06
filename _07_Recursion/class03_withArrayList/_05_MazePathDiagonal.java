import  java.util.*;
public class _05_MazePathDiagonal {
    public static ArrayList<String> mazePath(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();

        // TODO: Horizontal

        ArrayList<String> rec1 = mazePath(sr + 1, sc, er, ec);
        for (String rrs : rec1) {
            myAns.add('V' + rrs);
        }

        // todo: diagonal
        ArrayList<String> rec3 = mazePath(sr + 1, sc+1, er, ec);
        for (String rrs : rec3) {
            myAns.add('D' + rrs);
        }

        // todo: vertical
        ArrayList<String> rec2 = mazePath(sr, sc + 1, er, ec);
        for (String rrs : rec2) {
            myAns.add('H' + rrs);
        }

        return myAns;
    }

    public static void main(String[] args) {
        int sr = 0, sc = 0;
        int destr = 3, destc = 3;

        System.out.println(mazePath(sr, sc, destr, destc));
    }
}
