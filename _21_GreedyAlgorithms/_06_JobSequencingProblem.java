import java.util.ArrayList;
import java.util.Collections;

public class _06_JobSequencingProblem {
    static class Job{
        int deadLine;
        int profit;
        int id;
        public Job(int i, int d, int p){
            this.id=i;
            this.deadLine=d;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo [][] = {{4,20},{1,10},{1,40},{1,30}};
        
        ArrayList<Job>jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit); // disscending order of profit

        ArrayList<Integer>sequence = new ArrayList<>();
        int time =0;
        for(int i=0;i<jobs.size();i++){
            Job curr= jobs.get(i);
            if(curr.deadLine > time){
                sequence.add(curr.id);
                time++;
            }
        }
        System.out.println("Max jobs - "+sequence.size());
        for(int i=0;i<sequence.size();i++){
            System.out.print(sequence.get(i)+" ");
       }
    }    
}
