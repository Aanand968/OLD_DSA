import java.util.Scanner;

public class ElectricityBill {


    public static void main(String[] args) {

        int unit, bill;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Unit : ");
        unit = sc.nextInt();

        //0-100  rate is 4rs
        //101 - 200 rate is 5rs
        // 201-350 rate is 6rs
        // 351+ rate is 7rs
        if (unit > 0) {
            if (unit <= 100) {
                bill = unit * 4;
            } else if (unit <= 200) {
                bill = (100 * 4) + (unit - 100) * 5;
            } else if (unit <= 350) {
                bill = (100 * 4) + (100 * 5) + (unit - 200) * 6;
            } else {
                bill = (100 * 4) + (100 * 5) + (150 * 6) + (unit - 350) * 7;
            }
            System.out.println("Your Bill for unit " + unit + " is " + bill);
        }
    }
}
