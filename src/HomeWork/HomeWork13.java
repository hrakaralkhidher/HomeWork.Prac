package HomeWork;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        /*
        Write a calculator program by following instructions:
1) Ask the user to enter 1st number
2) Ask the user to enter second number
3) Ask the user to select the operation ( ask user to enter 1 for Summation,
 2 for Subtraction, 3 for Multiplication, and 4 for division.)
4) based on the selection perform operation and print the result of the operation
(Ex. enter 1st number : 20
	enter 2nd number: 25
	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	The result is : 45.)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Select the Operation, 1= Addition, 2= Subtraction, 3= Multiplication, 4= Division");
        double Operation = scan.nextDouble();

        if (Operation == 1) {
            System.out.println("The results are: "+(num1+num2));
        } else if (Operation == 2) {
            System.out.println("The results are: "+(num1-num2));
        } else if (Operation == 3) {
            System.out.println("The results are: "+(num1*num2));
        } else if (Operation == 4) {
            System.out.println("The results are: "+(num1/num2));
        }else{
            System.out.println(" User Error Invalid Input ");
        }
    }
}