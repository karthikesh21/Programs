// You're given a 12-digit card number. From right to left, alternately add and subtract the digits:
// Start with + (positive) for the rightmost digit, then -, then +, and so on.
// Take the absolute value of the final sum.
// Based on the result:
// If ≤ 10 → Visa Card
// If >10 and ≤15 → MasterCard
// If >15 → RuPay Card


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        int len = num.length();

        for (int i = len - 1, pos = 0; i >= 0; i--, pos++) {
            int digit = num.charAt(i) - '0';
            if (pos % 2 == 0)
                sum += digit;
            else
                sum -= digit;
        }

        int absSum = Math.abs(sum);

        if (absSum <= 10)
            System.out.println("Visa Card");
        else if (absSum <= 15)
            System.out.println("MasterCard");
        else
            System.out.println("RuPay Card");
    }
}
