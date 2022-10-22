package Practices_1;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        int fx=1;
        for (int i = 1; i <=x; i++) {
            fx=fx*i;
        }
        System.out.println(fx);


    }
}
