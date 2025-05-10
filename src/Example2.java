public class RecursiveFibonacci {

    // Hàm tính Fibonacci bằng đệ quy
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.print("Dãy Fibonacci (đệ quy): ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}