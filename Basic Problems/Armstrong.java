import java.util.*;
public class Armstrong{
    public static void main(String[] kar){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int org=num,sum=0;
    while(num>0){
        int digit=num%10;
        sum+=Math.pow(digit, 3);
        num/=10;
    }
    if(sum==org){
        System.out.println(org + " is an Armstrong number.");
    } else {
        System.out.println(org + " is not an Armstrong number.");
    }
}
}
