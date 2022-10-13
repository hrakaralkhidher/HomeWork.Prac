package Practices_1;

public class Practice_1  {
    public static void main(String[] args) {
        System.out.println("Hello People My name is Hrakar and i live i. USA.");
        System.out.println("This paragraph will contain a lot of words maybe its for the practice of java class \n \tThis is just me doing my own practices.");
        // There are two types of way to write a comment while coding 1) is starting with two slashes // 2) with /*
        /*
        this is is the example of the other way to comment while coding, some might ask why comment while coding,
        will the // is if you have a short comment and this /* is for the long comments, when coding especially when
        a hard code you need to explain most of the time so that if someone takes over your project they see what you have did.
         */

        //This is how to print your name is quotation
        System.out.println("\"Hrakar\"");

        //This is how to put your name is slashes
        System.out.println("//Hrakar//");

        /*Now lets move on to java variables, there are two types of the variables, 1) primitive data type variables.
        2) Non-Primitive data type variables.
         */
        // the following variables are the primitive fata type that holds only one value.

        //type name = value in this case boolean variables is the one that the value can only be true or false.
        boolean num1 = true;
        System.out.println(num1);
        boolean num2 = false;
        System.out.println(num2);

        //(byte) this variable value is from -128 to 127 one can not be greater.
        byte myByte = 114; // the value as you see it can NOT pass the range of -128 to 127
        System.out.println("myByte = " + myByte);
        // same thing with negative numbers
        byte myByte1 = -115;
        System.out.println("myByte1 = " + myByte1);

        // (char) this variable holds special characters such as 'a'  // etc
        char myChar = 'g';
        System.out.println("myChar = " + myChar);

        // (short) this variable value is from -32,768 to 32,767
        short myShort = 2500;
        System.out.println("myShort = " + myShort);
        short myShort1 = -3000;
        System.out.println("myShort1 = " + myShort1);

        // (int) or integer this variable value is -2,147,483,648 to 2,147,483,647
        int myInt = 4332223;
        System.out.println("myInt = " + myInt);
        int myInt1 = -43322234;
        System.out.println("myInt1 = " + myInt1);

        /*(long) tis variable is basically just a bigger number than the (int) but the system will automatically
        consider this as int if we dont put letter L at the end of the value for example,
         */
        long myLong = 223224232443l;
        System.out.println("myLong = " + myLong);
        // same thing with negative
        long myLong1 = -1223224232443l;
        System.out.println("myLong1 = " + myLong1);

        /*(float) this next two variables are even bigger than (long) and (integer)
        also dont forget to put the letter at the end of the value.
         */
        float myFloat = 899.99f;
        System.out.println("myFloat = " + myFloat);
        float myFloat1 = -8998.99f;
        System.out.println("myFloat1 = " + myFloat1);

        // (double) now the last primitive variable this is the variable that the value hold up to 16 decimals.
        double myDouble = 98.9877789;
        System.out.println("myDouble = " + myDouble);

        /*
        ALL THE ABOVE VARIABLE ARE THE PRIMITIVE VARIABLES THAT
         ONLY HOLDS ONE VALUE AND ALSO START WITH LOWERCASE MOSTLY.
         */




    }
}
