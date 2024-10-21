package Aanand;

import java.io.PrintStream;

class HelloWorld {

    public static void main(String[] args) {

        int a=10 , b=15 , ans;
        PrintStream ps= new PrintStream(System.out);
        ps.println("Hello world");
        a=25;
        ans = a+b;
        ps.printf("Sum of %d and %d is %d ",a,b,ans);
    }
}
