import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int HH,MM;
        float a;
        str=sc.nextLine();
        String[] arrstr= str.split(":");
        HH=Integer.parseInt(arrstr[0]);
        MM=Integer.parseInt(arrstr[1]);
        a=Math.abs((float)((30*HH)-((5.5)*MM)));
        if(a>180)
        a=360-a;
        System.out.printf("%.1f",a);
    }
}