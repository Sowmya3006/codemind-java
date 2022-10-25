import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float r,a;
        r=sc.nextFloat();
        a=(float)((3.14)*(r)*(r));
        System.out.printf("%.2f",a);
    }
}