import java.util.*;
class Swaping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int temp;
        temp=n;
        n=m;
        m=temp;
        System.out.println("After Swapping: "+n+" "+m);
    }
}
