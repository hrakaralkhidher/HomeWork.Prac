package Day_StudyHall;

public class StringMethods {
    public static void main(String[] args) {

        String myString = null;
        String myString1 = "";
        System.out.println(myString1.isEmpty());


        // lowercase and uppercasse

        String myText = "Hello .!2 World";
        System.out.println(myText.toLowerCase());
        System.out.println(myText.toUpperCase());

        //Indexof
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("planet",7));

        //LastIndexof
        System.out.println(myStr.lastIndexOf("planet",6));



        //replace

        String myStr2 = "Hello";
        System.out.println(myStr2.replace("l","p"));
        System.out.println(myStr2.replace("l","p"));

        //endwith

        String email = "renas@tech.com";
        System.out.println(email.endsWith(".com")||email.endsWith(".ca"));

        //startwith
        System.out.println(email.startsWith("renas"));



    }//end main
}//end class
