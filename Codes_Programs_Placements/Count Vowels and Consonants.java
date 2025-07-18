import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
