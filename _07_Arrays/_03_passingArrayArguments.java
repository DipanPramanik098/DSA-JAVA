public class _03_passingArrayArguments {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] +=1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        // arrays passed by refference
        // variable - pass by value
        update(marks);

        // print
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}
