import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s,ta;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        ta=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",ta);
    }
}