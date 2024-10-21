package Aanand;
import java.util.*;
class demo
{
    public static void main(String []args)
    {
        //dummy code
        Scanner input = new Scanner(System.in);
        int a,b,sum;
        System.out.print("Enter A : ");
        a= input.nextInt();
        System.out.print("Enter B : ");
        b= input.nextInt();
        sum=a+b;
        System.out.print("sum of "+a+" and "+b+" is "+sum );
        input.close();
    }
}