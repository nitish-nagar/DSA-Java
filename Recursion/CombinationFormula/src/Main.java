public class Main {
    static int fact(int n){
        if(n == 0)
            return 1;
        else
            return n * fact(n-1);
    }
    static int nCr(int n , int r){
        if(r==0 || n==r)
            return 1;
        else
            return nCr(n-1,r-1) + nCr(n-1,r);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 4: " + fact(4));
        System.out.println("Combination of 3C2: " + nCr(3,2));
    }
}