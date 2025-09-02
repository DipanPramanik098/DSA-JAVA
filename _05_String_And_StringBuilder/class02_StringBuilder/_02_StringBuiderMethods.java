public class _02_StringBuiderMethods {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - inserts text at specified index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. replace() - replaces a substring
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 4. delete() - deletes a substring
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        // 5. reverse() - reverses the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. charAt() - gets character at index
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // 7. setCharAt() - sets character at index
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 8. length() - length of StringBuilder
        System.out.println("Length: " + sb.length());

        // 9. capacity() - capacity of internal array
        System.out.println("Capacity: " + sb.capacity());

        // 10. toString() - convert to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
