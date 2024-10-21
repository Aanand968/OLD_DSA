package Aanand;

import java.io.PrintStream;
import java.util.*;

class elecbill {

    public static void main(String[] args) {
        double result, total=0, n, tax=0;

        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream(System.out);
        ps.println("THIS PROGRAM CALCULATES ELECTRICITY BILL ");
        ps.print("ENTER UNITS OF ELECTRICITY CONSUMED : ");
        n = s.nextDouble();
        if (n <= 50) {
            total = n * 0.50;
         /*   tax = (result * 20) / 100 + result;
           ps.print("YOUR BILL IS" + tax);*/

        } else if (n > 50 && n <= 150) {
            total = 50 * 0.50;
            result = (n - 50) * 0.75 + total;
            tax = (result * 20) / 100 + result;
            ps.print("YOUR BILL IS " + " " + tax);

        } else if (n > 150 && n <= 250) {
            total = (50 * 0.50) + ((n - 50) * 0.75);
            result = (n - 150) * 1.20 + total;
            tax = (result * 20) / 100 + result;
            ps.print("YOUR BILL IS " + " " + tax);
        } else if (n > 250) {
            total = (50 * 0.50) + ((n - 200) * 0.75) + ((n - 200) * 1.20);
            result = (n - 250) * 1.50 + total;
            tax = (result * 20) / 100 + result;
            ps.println("YOUR BILL IS " + " " + tax);
        } else {
            ps.print("wrong value");
        }
        tax= total*20 /100;
        System.out.println("your tax is "+tax);
        total=total+tax;
        System.out.println("your bill for "+n+" units is RS"+total);
        s.close();
    }
}
