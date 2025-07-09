// You are given a string S. The task is to determine whether the given string is a palindrome or not. A string is said to be a palindrome if it reads the same backward as forward.



import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String rev = new StringBuilder(s).reverse().toString();
        
        if (s.equals(rev)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
