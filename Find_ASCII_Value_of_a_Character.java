import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println(ascii);
    }
}