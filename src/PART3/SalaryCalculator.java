package PART3;

import java.util.Scanner;

public class SalaryCalculator {
    int hourFee = 10;
    int workedHours = 50;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce the amount of hours worked : ");
        int hours = sc.nextInt();

        System.out.print("\nIntroduce the fee per hour : ");
        int fee = sc.nextInt();


        int extraHours = 0;
        if(hours > 40){
            extraHours = hours - 40;
            hours = 40;
        }

        double salary = hours * fee + (extraHours*(fee*1.5));
        System.out.print("\nThe total salary of the worker is : " + salary);
    }
}
