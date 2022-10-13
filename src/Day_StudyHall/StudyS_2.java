package Day_StudyHall;

public class StudyS_2 {
    public static void main(String[] args) {

        //Logical operator
        //& and operator
        boolean check1 = true&&true;
        boolean check2 = false&&false;
        boolean check3 = true&&false;
        System.out.println("check1 = " + check1);
        System.out.println("check2 = " + check2);
        System.out.println("check3 = " + check3);
        boolean check4 = true&&true&&true&&false;
                            //true && true && false
                            //true&&false
                            //false
        //|| or operator

        boolean check5 = true || true; //true
        boolean check6 = false || false; //false
        boolean check7 = true || false; //true
        boolean check8 = false || false || true || true; //true

        // Assignment operator
        String myString = "class";
        myString = myString + "-7";
        System.out.println("myString = " + myString);

        int myInt = 10;

        myInt = myInt + 3; // 13
        System.out.println(myInt);
        myInt = 15;
        System.out.println("myInt = " + myInt);

        int myInt2 = 15;
        myInt2 = 20;
        System.out.println(myInt2 =20);

        // Basic algorith question

        int myInt3 = 1;
        int myInt4 = 2;
        //myInt3 = 2 and myInt4 =1
        myInt3 = myInt4;
        myInt4 = myInt3;
        System.out.println("***** *** ***");
        System.out.println(myInt3);
        System.out.println(myInt4);
        System.out.println("******* **** ****");
        String myString1 = "Renas";
        String myString2 = "Tech";
        String temp = null;
        temp = myString1;
        myString1 = myString;
        myString2 = temp;
        System.out.println(myString1);
        System.out.println(myString2);

    }
}
