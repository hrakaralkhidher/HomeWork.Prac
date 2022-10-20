package Practices_1;

import java.util.Scanner;

public class ForLoopsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter someones name to revers it: ");
        String input1 = scan.nextLine();
        char ch2 = input1.charAt(0);
        System.out.println("the length of the input "+input1.length());
        String reverse1 = " ";
        for (int i = input1.length()-1; i > 0 ; i--) {
            reverse1 = reverse1+input1.charAt(i);
        }
        System.out.println("the reverse vale of the reverse1 is: "+reverse1);
    }
}
