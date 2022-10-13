package Practices_1;

public class Nd_StudyHall {
    public static void main(String[] args) {

    /*
        //byte -> -128 and 127

        //type name = value
        byte myByte = 10;
        System.out.println(myByte);

        //short -32.768 to 32767
        short myShort = 5000;
        System.out.println(myShort);

        //int -2.147.483.6748 to2.147.483.6747

        int myInt = 2147483647;
        System.out.println("myInt = " + myInt );

        //long -9.223.372.854.775.808 to 9.223.372.854.775.807
        long mylong = 21474836471l;
        System.out.println("mylong = " + mylong);

        //float 6 decimal

        float myFloat = 3.143331f;
        System.out.println("myFloat = " + myFloat);

        //double up to 15 decimal

        double myDouble = 3.14322131231d;
        System.out.println("myDouble = " + myDouble);

        //char data type

        char myChar = '2';
        System.out.println("myChar = " + myChar);

        //String (Non-Primitive data type also most of the time the start with capital

        String myString = "Renas";
        String mySecondString ="Tech";

        String myString1 = "Renas",
                MysecondString1 = "Renas";

     */

        //string concentantion

        String myString3 ="Renas";
        String mysecondString = "Tech";
        System.out.println(myString3+"" + mysecondString +"!");
        System.out.println(myString3 + "Tech");

        int num1 = 3;
        float num2 = 0.14f;
        System.out.println("The pi number is not "+ num1 + num2);
        //"the pi number is 3" +num2
        //"the pi numbeer is 30.14"
        System.out.println("the pi number is " + (num1+num2));
        System.out.println(num1+num2 + "the pi number");

        //subtraction

        byte num3 =-127;
        byte num4 = +5;
        System.out.println(num3-num4);

        //multiplication

        int num5 = 2;
        int num6 = 2;
        int num7 = 2;
        System.out.println(num5 * num6 * num7 * 2);

        //divition

        int num8 = 81;
        int num9 = 40;
        System.out.println("81 / 40= " + num8 / num9);

        float num10 = 81.0f;
        int num11 = 40;
        System.out.println("81.0 / 40= " + num10 / num11);
        //
        System.out.println("81.0 / 40= " + num10 + num11);

        //% remainder

        int num12 = 11;
        System.out.println("******");
        System.out.println(num12 % 4);  // 11/4 =2 and as reainder part we have 3

        //Realational Operations
        // == , !=, <, <=, >=, >=, //==
        String sitename = "Amazone.com";

        boolean check1 = 11==11;
        System.out.println("check1 = " + check1);
        
        //!=
        boolean check2 = 1 != 1;
        System.out.println("check2 = " + check2);

        //< <= less than less than or equal to
        System.out.println(10<=10);
        // >, >= greater than or greater than equal

        // !

        boolean check3 =! (!(false==true));
                        //!(true == true)
                        //!(true)
                        // false
        System.out.println(check3);







    }
}
