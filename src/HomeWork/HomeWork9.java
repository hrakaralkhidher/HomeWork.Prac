package HomeWork;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        //Write a code where User is being asked for the first number
        //second number and third number. Then Compare those number print the maximum number.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 1st number: ");
        int H1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the 2nd number: ");
        int H2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the 3rd number: ");
        int H3 = scan.nextInt();
        scan.nextLine();

        if (H1 > H2 && H1 > H3) {
            System.out.println(" The maximum number is: " + H1);
        } else if (H2 > H1 && H2 > H3) {
            System.out.println("The maximum number is: " + H2);
        } else if (H3>H1 && H3>H2) {
            System.out.println("The maximum number is: "+H3);
        }else{
            System.out.println("There are no max numbers.");
        }
        //int result= (number1>number2 && number1>number3) ? number1 : (number2>number3 && number2>number1) ? number2 : number3 ;
        //System.out.println("The Max Number is: "+result);
    }
}