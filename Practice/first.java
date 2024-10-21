import java.util.Scanner;

public class first {
    static int a,b,c;
     void  add(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first number : ");
         a = sc.nextInt();
         System.out.print("Enter the second number : ");
         b = sc.nextInt();
         c = a + b;
         System.out.println(" The Answer is " + c);
         sc.close();

    } void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a=sc.nextInt();
        System.out.print("Enter the second number : ");
        b=sc.nextInt();
        c= a-b;
        System.out.println(" The Answer is "+ c);
sc.close();
    }
    
}
