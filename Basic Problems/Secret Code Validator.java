// 🔐 Serial Code Classifier
// You're given a 12-digit number. Determine its type based on a special scoring logic:
// 🎯 Logic:
// Go right to left across digits.
// Multiply each digit with this pattern of multipliers:
// Copy code
// +1, -2, +3, -4, +5, -6, +7, -8, +9, -10, +11, -12
// Add the results together and take the absolute value.
// 🧮 Final Score → Code Type:
// ≤ 30 → Safe Code
// >30 and ≤60 → Alert Code
// >60 → Danger Code
// 🟢 Input:
// A 12-digit number (e.g. 123456789123)
// 🔴 Output:
// One of the following:
// Copy code
// Safe Code
// Alert Code
// Danger Code

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int sum=0;
        int multi=1;
        int into=1;
        long n =sc.nextLong();
        while(n>0){
        int res=(int)(n%10);
        sum+=res*multi*into;
        multi++;
        into*=-1;
        n/=10;
        }
       int totalsum=Math.abs(sum);
        
        if(totalsum<30){
            System.out.println("Safe Code");
        }
        else if(totalsum<=60){
            System.out.println("Alert Code");
        }
        else{
            System.out.println("Danger Code");
        }
    
    }
}
