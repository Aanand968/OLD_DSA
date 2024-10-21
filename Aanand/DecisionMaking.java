import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        long year ;
        System.out.println("\n\t**This is the leap year finder Program**\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year : ");
        year=sc.nextLong();
        if (year % 4 == 0){
            if (year>2023){
                System.out.println("This will be a leap year");
            }else {
                System.out.println("This was a leap year");
            }
        }else{
            if (year>2023){
            System.out.println("\nThis will not be a leap year");
        }else{
                System.out.println("This was not a leap year");
            }
        }
        System.out.println("\n\t**Thankyou for using this application**");
    }

}
