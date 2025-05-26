public class RecursiveFibonacci {

    // Hàm tính Fibonacci bằng đệ quy
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    Đây nhà nhánh trước nhaa