package Aanand;
import java.util.Scanner;

public class DataAccess {
    static int k=10;
    int age ,roll ;
    String name,gender ;

void DataEnter(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age : ");
    this.age=sc.nextInt();
    System.out.print("Enter your Roll No. : ");
    this.roll= sc.nextInt();
    sc.nextLine();
    System.out.print("Enter your name : ");
    this.name=sc.nextLine();
    System.out.print("Enter your gender : ");
    this.gender=sc.nextLine();
}

void ShowData(){
    System.out.println("Here are the Details for " + this.name);
    System.out.println("Name : "+this.name);
    System.out.println("Roll No. : "+this.roll);
    System.out.println("Gender : "+this.gender);
    System.out.println("Age : "+this.age);
}

    public static void main(String[] args) {
        DataAccess Aarav = new DataAccess();
        DataAccess Aanand = new DataAccess();
        DataAccess joya = new DataAccess();

        //Aarav.DataEnter();
        //Aarav.ShowData();
        System.out.println(k);

    }



}
