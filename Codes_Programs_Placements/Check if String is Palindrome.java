import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed))
            System.out.println("It is a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
