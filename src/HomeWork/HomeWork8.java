package HomeWork;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
        write a code where it check the credit score for a person.
The code should have First Name, Last name and Credit Score
of a person. (think about what datatype of variables you need to use)
If a person have a credit score less then 500 == > print "<person First Name>  <Person Last Name> has Bad Credit Score"
if a person have credit between 500-700 ==> print "<person First Name>  <Person Last Name> has Average Credit Score"
if a person have credit between 700-750 ==> print "<person First Name>  <Person Last Name> has Good Credit Score"
if a person have credit between
 greater than 750==> print "<person First Name>  <Person Last Name> has Great Credit Score
         */
        String FirstName = "David";
        String LastName = " Noone";
        int CreditScore = 800;

        if(CreditScore < 500){
            System.out.println(FirstName+LastName+ " has a bad credit Score.");
        } else if (CreditScore >= 500 && CreditScore < 700 ) {
            System.out.println(FirstName+LastName+ " has Average credit Score");
        } else if (CreditScore > 700 && CreditScore >= 750 ) {
            System.out.println(FirstName+LastName+ " has a Good Credit Score");
        } else {
            System.out.println(FirstName+ LastName+ " has a Great Credit Score");
        }
    }
}
