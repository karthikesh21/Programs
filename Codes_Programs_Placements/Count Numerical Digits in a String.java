import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        for (char c : str.toCharArray())
            if (Character.isDigit(c)) count++;

        System.out.println("Number of digits: " + count);
    }
}
