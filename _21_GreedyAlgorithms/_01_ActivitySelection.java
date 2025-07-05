import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _01_ActivitySelection {
    public static void main(String[] args) {
        int start []={1,3,0,5,8,5};
        int end []={2,4,6,7,9,9};
        // end time base sorted 

        // INFO: if note sorted then sorted process
        int Activity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }
        // lambda function -> shortform
        Arrays.sort(Activity,Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(Activity[0][0]);
        int lastEnd = Activity[0][2];
        int maxActivity = 1;
        for(int i=1;i<end.length;i++){
            if(Activity[i][1] >= lastEnd){
                maxActivity++;
                ans.add(Activity[i][0]);
                lastEnd = Activity[i][2];
            }
        }
        System.out.println("Maximum Activity = "+ maxActivity);
        for(int i=0;i<ans.size();i++){
            System.out.print("Activity-"+ans.get(i)+",  ");
        }
    }    
}
