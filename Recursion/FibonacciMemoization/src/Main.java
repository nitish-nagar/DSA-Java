public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci number = " + fib(5));
    }

    static int[] memoization = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public static int fib(int n){
        if(n <= 1) {
            memoization[n] = n;
            return n;
        } else {
            if (memoization[n - 2] == -1) {
                memoization[n - 2] = fib(n - 2);
            }
            if (memoization[n - 1] == -1) {
                memoization[n - 1] = fib(n - 1);
            }
            return memoization[n-2] + memoization[n-1];
        }
    }
}