package practice;

import java.util.Scanner;

public class Function1 {
//    Print a number entered by a user
   public static void main(String args[]){
//        System.out.println("Hello World");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number!");
        int iMyVariable=scanner.nextInt();
        System.out.println("Entered number is :"+iMyVariable);
    }
}
