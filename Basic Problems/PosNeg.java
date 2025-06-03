import java.util.*;

public class PosNeg {
    public static void main(String[] kar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        String input = sc.nextLine();
        String[] arr = input.split("\\s+");

        for (String s : arr) {
            try {
                int num = Integer.parseInt(s);
                if (num > 0) {
                    System.out.println("Positive number: " + num);
                } else if (num < 0) {
                    System.out.println("Negative number: " + num);
                } else {
                    System.out.println("Zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + s);
            }
        }
    }
}
