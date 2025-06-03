import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c=sc.next().charAt(0);
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'|| c=='A'||c=='E'|| c=='I'||c=='O'|| c=='U'){
            System.out.println(c+" is a vowel");
        }
        else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c+ " is a consonant");
        } 
        else if(c>='0' && c<='9'){
            System.out.println(c+ "Digits");
        }
        else{
            System.out.println(c+ "is a special character");
        }
    }
}
