import java.util.Scanner;

public class SumOfNumbers {


    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();

        while (num>0){
            sum=sum+num;
            num--;
        }
        System.out.println(sum);



    }


}
