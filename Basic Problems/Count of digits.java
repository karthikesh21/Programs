import java.io.*;
import java.util.*;

    public class Digits{
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.print(count);
    }
}
