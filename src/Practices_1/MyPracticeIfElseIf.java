package Practices_1;

public class MyPracticeIfElseIf {
    public static void main(String[] args) {

            /*
       another example of the if and if else. in order to come to the party you have to have one of this anf if not you
       will not be able to attend to the party, the conditions are, "18 or older", need to "weight 144 to 200 lbs"
       bring 3 guests or less.
        */

        String Name = "Hrakar";
        int age = 20;
        int weight = 145;
        int guests = 3;

        if (age > 18){
            System.out.println(Name+ " is allowed to enter to  the party");
        } else if (weight < 155 ) {
            System.out.println(Name+ " is Not allowed to enter to the party");
        }


    }
}
