package HomeWork;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        //  Write a Revenue program, Where user enters the quantity of the products sold and the price for each product.
        //  Then Calculate his revenue based on giving information (hint: Revenue = quantity x price)

        Scanner wow = new Scanner (System.in);

        System.out.println("The quantity of the items sold: ");
        int sold = wow.nextInt();
        wow.nextLine();
        System.out.println("The Price for Each Product: $");
        double price = wow.nextDouble();
        double revenue = sold*price;
        System.out.println("The revenue is:  $"+revenue);



    }
}
