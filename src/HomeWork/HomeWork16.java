package HomeWork;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
      /*Write a code where it meets the below requirements
- a couple just got married and goes to city hall to get their last name changed
- the officer who works there asks the couple about their first name and last name for each
- also asks if they want to use the same last name or
keep their original last names ( for the same last name you can use either one of them)
- based on the answer print the couples first names and last names
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Officer Asking the Male: What is your FirstName Sir?");
        String GFirstName = scan.nextLine();
        System.out.println("Officer asking Male: What is your LastName Sir?");
        String GLastName = scan.nextLine();
        System.out.println("Officer asking Bride: Whats your FirsName Ma'am?");
        String BrideFName = scan.nextLine();
        System.out.println("Officer asking Bride: Whats your LastName Ma'am?");
        String BrideLName = scan.nextLine();
        System.out.println("Officer asking Both: Do you both want to change your Lastnames Or keep the Original LastName?");
        String GroomandBride = "We want to change our last name to: "+GLastName+scan.nextLine();





    }
}
