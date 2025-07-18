import java.util.Scanner;

public class NonMatchingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.print("Non-matching characters: ");
        for (char c : s1.toCharArray())
            if (!s2.contains(String.valueOf(c)))
                System.out.print(c + " ");
    }
}
