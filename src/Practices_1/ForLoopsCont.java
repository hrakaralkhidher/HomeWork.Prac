package Practices_1;

import java.util.Scanner;

public class ForLoopsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter someones name to revers it: ");
//        String input1 = scan.nextLine();
//        char ch2 = input1.charAt(0);
//        System.out.println("the length of the input "+input1.length());
//        String reverse1 = " ";
//        for (int i = input1.length()-1; i > 0 ; i--) {
//            reverse1 = reverse1+input1.charAt(i);
//        }
//        System.out.println("the reverse vale of the reverse1 is: "+reverse1);
//
//        System.out.println("****************************************************************");
//
//        System.out.println("Enter anyones name to revers: ");
//        String name = scan.nextLine();
//        char chh = name.charAt(0);
//        System.out.println("the length of the sent: "+name.length());
//        String reverse3 = " ";
//        for (int i = name.length()-1; i>0 ; i--) {
//            reverse3=reverse3+name.charAt(i);
//        }
//        System.out.println("the reverse value is now: "+reverse3);
//
//
//        System.out.println("**************************************************");
//
//        //another example of the reverse String using the for loops
//        String original= "Hrakar";
//        String reverse= " ";
//        for(int i = 0; i < original.length();i++){
//            reverse= original.charAt(i)+reverse;
//        }
//        System.out.println("reverse value is:"+reverse);
        //for loop ex
        System.out.println("whats your name: ");
        String name = scan.nextLine();
        String rvs = "";
        for (int i = 0; i < name.length(); i++) {
            rvs= name.charAt(i)+rvs;
        }
        System.out.println("Your name reversed: "+rvs);
    }
}
