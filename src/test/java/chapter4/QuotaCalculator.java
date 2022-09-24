package chapter4;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        System.out.println("Hello World");
//        Initialize the value we know
        int quota=10;

//        Get th values we don't know
        System.out.println("Enter the number of sales you made this week?");
        Scanner scanner=new Scanner(System.in);
        int sales=scanner.nextInt();
        scanner.close();

//        Make a decision on path to take
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }else{
            System.out.println("We did not meet your target! You were short of :-"+(quota-sales));
        }

    }
}
