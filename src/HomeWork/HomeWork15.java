package HomeWork;

import java.util.Scanner;

public class HomeWork15 {
   // Write a Code where user is being asked to enter a sentence
//if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a" replace
// second and fourth characters with "G"
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Write a Sentence:");
      String sentence = scan.nextLine();
   if (sentence.startsWith("B") && sentence.startsWith("b") || sentence.endsWith("E") && sentence.endsWith("e")
   || sentence.contains("A") && sentence.contains("a"))
   {
      String result = sentence.substring(0, 1) + 'G' + sentence.substring(2, 3) + 'G' + sentence.substring(4);
      System.out.println("The Result is : "+result);
   }


      

   }//end main
}//end class
