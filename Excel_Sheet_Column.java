import java.lang.*;
import java.io.*;
import java.util.*;
class Excel{
    public static String value(int num){
        StringBuilder res = new StringBuilder();
        while(num>0){
            num--;
            char toAdd =(char)(num%26+65);
            res.insert(0,toAdd);
            num/=26;
            
        }
        return res.toString();
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=26)
        System.out.println((char)(64+n));
        else
        System.out.println(value(n));
    }
}