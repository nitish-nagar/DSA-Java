public class Main {

    public static boolean isPalindrome(String s){
        return ((s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString()));
    }

    public static boolean isPalindromeRecursive(String s){
        if(s == null || s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPalindromeRecursive(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("oyo"));
        System.out.println(isPalindromeRecursive("oyo"));
    }
}