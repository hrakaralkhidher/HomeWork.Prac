package Day_StudyHall;

public class one {
    public static void main(String[] args) {
        int number = 44;
        String size;


        switch (number){

            case 44:
                size = "Small";
                break;
            case 40:
                size = "Medium";
            case 68:
                size = "Large";
                break;
            default:
                 size = "Unknown";

                System.out.println("Size: "+size);


        }

    }//end main
}// end class
