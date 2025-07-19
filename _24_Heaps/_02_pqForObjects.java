import java.util.PriorityQueue; // Importing PriorityQueue class

public class _02_pqForObjects {

    // Define a static inner class Student which implements Comparable to define
    // custom sorting
    static class Student implements Comparable<Student> {
        String name; // Name of the student
        int rank; // Rank of the student

        // Constructor to initialize Student object
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Overriding compareTo() method to define sorting logic for PriorityQueue
        @Override
        public int compareTo(Student s2) {
            // Sort in ascending order of rank (Min-Heap behavior)
            return this.rank - s2.rank;
            // For Max-Heap use: return s2.rank - this.rank;
        }
    }

    public static void main(String[] args) {

        // Creating a PriorityQueue of Student type
        // It will sort based on compareTo method defined in Student class
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // Adding Student objects to the priority queue
        pq.add(new Student("Dipan", 12)); // Adds student with rank 12
        pq.add(new Student("Pramanik", 11)); // Adds student with rank 11
        pq.add(new Student("Dip", 27)); // Adds student with rank 27

        // Loop to process elements in order of priority (lowest rank first)
        while (!pq.isEmpty()) {
            // Retrieve (but not remove) the student at the head of the queue
            System.out.println("name = " + pq.peek().name + " Rank = " + pq.peek().rank);

            // Remove the head student from the queue
            pq.remove(); // Can also use pq.poll()
        }
    }
}
