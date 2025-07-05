import java.util.*;

public class _07_stockSpan {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0); // Push first index
        span[0] = 1; // Span for first day is always 1

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            
            // Pop lower prices from stack
            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }

            // If stack is empty, current price is greater than all previous prices
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;  
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
