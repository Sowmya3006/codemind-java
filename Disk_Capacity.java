import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        long c;
        c=512*b*t*s*2;
        System.out.println(c);
    }
}