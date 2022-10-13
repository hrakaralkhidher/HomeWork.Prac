package Practices_1;

public class Strings {
    public static void main(String[] args) {
        //String is the Non-Primitive data type that holds multiple values

        String name = "Hrakar Al Khidher";
        System.out.println("My Name is: " + name);

        //this variable is basically you can write anything but its always considered as a text for example if i put #.

        String numbers = "793479834892847893279483*&^%$$$%#%$#$%^&*";
        System.out.println("My Numbers = " + numbers);

        // to combine two text
        String text1 = "I Am 25 Years Old And ";
        String text2 = "I Am From Iraq. ";
        String Text3 = text1+text2;
        System.out.println("Text3 = " + Text3);

        //if you put the numbers in the variables they will count as text not numbers.
        String num1 = "25";
        String num2 = "23";
        String num3 = num1+num2;
        System.out.println("num3 = " + num3);


    }
}
