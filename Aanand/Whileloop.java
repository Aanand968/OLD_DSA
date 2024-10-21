import java.util.Scanner;

public class Whileloop {


    public static void main(String[] args) {

        int num , i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table Number : ");
        num = sc.nextInt();
        while(i<=10){
            System.out.println(num + " X " + i +" = " + (num*i));
            i++;
        }



    }
}
