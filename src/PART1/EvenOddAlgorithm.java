package PART1;

import java.util.Scanner;
public class EvenOddAlgorithm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int NUMERO = sc.nextInt();

        if(NUMERO%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        for(int i = NUMERO; i >= 0 ; i-=2){
            System.out.print(i + " \n");
        }
        sc.close();
    }
}
