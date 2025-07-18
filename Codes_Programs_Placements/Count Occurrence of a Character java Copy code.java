import java.util.Scanner;

public class CountCharOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);
        long count = str.chars().filter(ch -> ch == target).count();
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
