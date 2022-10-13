package Day_StudyHall;

public class StudyHall29 {
    public static void main(String[] args) {
        //implicit Casting
        int i = 100;
        double d = i;
        System.out.println("i = " + i);
        // explicit casting
        double dd = 100;
        int ii =(int)dd;
        System.out.println("dd = " + dd);

       int time = 22;
       if(time<10) {
           System.out.println("Good Morning");
       } else if (time<22) {
           System.out.println("Good Day");
       } else if (time > 33) {
           System.out.println("something else");
       }else {
           System.out.println("nothing");
        }

       int coffee_ordered_in_last_week = 4;
       int discount = 10;
       if(coffee_ordered_in_last_week > 5){
           discount = 10;
       }else{
           discount = 5;
       }

       int age = 25;
       if (age < 18){
           System.out.println("Person can not enter!");
       } else if (age >= 18 && age < 25) {
           System.out.println("Person is allowed to enter");
       } else if (age>25 && age < 80) {
           System.out.println("Alcohol cn be bad for you, so dont enter.");
       }else {
           System.out.println("bar is closed");
       }

       /*
       another example of the if and if else. in order to come to the party you have to have one of this anf if not you
       will not be able to attend to the party, the conditions are, "18 or older", need to "weight 144 to 200 lbs"
       bring 3 guests or less.
        */


    }

}
