import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float r,a,m;
        r=sc.nextFloat();
        a=sc.nextFloat();
        m=(float)(r*a);
        System.out.printf("%.2f",m);
    }
}