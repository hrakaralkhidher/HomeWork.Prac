package HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        // this code represent if the weather is so cold, cold, Good, Hot, So Hot.
        double Temp = 100;

          if (Temp < 10 ){
            System.out.println("The weather is so cold");
        } if (Temp>=10 && Temp<40) {
            System.out.println("The Weather is cold");
        } if (Temp>=40 && Temp < 70) {
            System.out.println("The Weather is Good");
        } if (Temp >= 70 && Temp <90){
            System.out.println("The Weather is Hot");
        } if (Temp > 90){
            System.out.println("The Weather is so Hot");
        }
    }
}
