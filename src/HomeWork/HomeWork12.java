package HomeWork;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        /*
        -Write a code where a teacher is entering
        student's first name, last name and the point they received from the exam.
    - based on the point the code should automatically determine the grade of Student with the full name of the student
    - This should be done for each student
    - Assuming we do not know how many student are there but your code should still handle this situation
    -  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
    - When the point is between 90 to 100 the grade should be A
    - When the point is between 80 to 90(excluded) the grade should be B
    - When the point is between 70 to 80(excluded) the grade should be C
    - When the point is between 60 to 70 (excluded) the grade should be D
    - When the point is less than 60 the grade should be F
    - Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */

        Scanner snap = new Scanner (System.in);

        System.out.println("Student Firstname: ");
        String Firstname = snap.nextLine();
        System.out.println("Student's Lastname: ");
        String Lastname = snap.nextLine();
        System.out.println("Student's Grade: ");
        Double Grade = snap.nextDouble();

        if (Grade < 60){
            System.out.println(Firstname+Lastname+ " Your Grade is: F");
        } else if (Grade >=60 && Grade <=70) {
            System.out.println(Firstname+Lastname+ " Your Grade is: D");
        } else if (Grade >= 70 && Grade <= 80) {
            System.out.println(Firstname+Lastname+ " Your Grade is: C");
        } else if (Grade > 80 && Grade <= 90) {
            System.out.println(Firstname+Lastname+ " Your Grade is: B");
        } else if (Grade > 90 && Grade <= 100) {
            System.out.println(Firstname+Lastname+ " Your Grade is: A");
        }else{
            System.out.println(Firstname+Lastname+ "User ERROR Invalid Input.");
        }

    }
}
