import java.util.*;
public class _02_inputOutput {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Give 5 number as input : ");
        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Your Array : ");
        // print array
        for(int i=0; i<5;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("============");
        // length
        System.out.println("Length = "+marks.length);
    }
}
