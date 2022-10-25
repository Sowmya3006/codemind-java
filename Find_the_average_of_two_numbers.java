import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float s;
        s=(float)((a+b)*(0.5));
        System.out.printf("%.4f",s);
    }
}