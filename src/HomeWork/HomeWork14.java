package HomeWork;


import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a name:
        //if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name: ");
        String name = scan.nextLine();
        String Rename = name.replace('A','B');
        System.out.println("Now your name is: "+Rename);

    }//end main
}//end class
