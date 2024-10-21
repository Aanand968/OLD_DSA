import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of a : ");
        a=sc.nextInt();
        System.out.print("Please enter the value of b : ");
        b=sc.nextInt();

        System.out.printf("The addition of %d and %d is %d",a,b,a+b);
    }
}
