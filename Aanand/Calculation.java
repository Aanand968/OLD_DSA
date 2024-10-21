import java.io.PrintStream;

public class Calculation {

    public static void main(String[] args) {
        int a=2, b=6 , ans;
        ans=a+b;
       // PrintStream ps = new PrintStream(System.out);
        System.out.printf("Addition of %d and %d is %d",a,b,ans);
        System.out.printf("\nMultiplication of %d and %d is %d \n",a,b,a*b);
        System.out.println("this is new line ");
        System.out.println("This is my output ");
        System.out.printf("%d",ans);
    }
}
