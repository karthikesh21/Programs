import java.util.*;
public class DigitPowerSum {
    public static void main(String kar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter an power: ");
        int pow=sc.nextInt();
        int result=0,sum=0;
        
        while(n>0){
            int res=n%10;
            result=(int)Math.pow(res,pow);
            sum+=result;
            n=n/10;
        }
        System.out.println("The sum of the digits raised to the power " + pow + " is: " + sum);
    }
}
