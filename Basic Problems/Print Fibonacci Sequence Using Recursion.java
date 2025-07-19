import java.util.Scanner;

public class FibonacciRecursion {
    static void fib(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            fib(n - 1, b, a + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence:");
        fib(n, 0, 1);
    }
}
