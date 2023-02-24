package pl.javastart.euler2;

public class Euler2 {

    private static int[] fibonacciCache;
    private static int nSumFibonacciNumber;
    private static final int maxValue = 4_000_000;

    public static void main(String[] args) {
        int n = 44;

        fibonacciCache = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (fibonacciSequence(i) % 2 == 0) {
                if (nSumFibonacciNumber < maxValue) {
                    System.out.print(fibonacciSequence(i) + " ");
                }
            }
        }
    }

    static public int fibonacciSequence(int n) {
        if (n <= 1) {
            return n + 1;
        }

        nSumFibonacciNumber = (fibonacciSequence(n - 1) + fibonacciSequence(n - 2));
        fibonacciCache[n] = nSumFibonacciNumber;

        return nSumFibonacciNumber;
    }
}
