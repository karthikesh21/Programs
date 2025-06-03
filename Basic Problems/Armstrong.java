import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int org=num,sum=0;
        int digits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum+=(int)(Math.pow(digit,digits));
            num/=10;
        }
        if(sum==org){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
