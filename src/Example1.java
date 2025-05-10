public class FibonacciExample {
    public static void main(String[] args) {
        int count = 10;
        int a = 0, b = 1;

        System.out.print("Dãy Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
