package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = true; 
        if (areHoursValid(hours) && areMinutesValid(minutes)){
          timeValid = true;
          
          
        } 
         System.out.println("Time valid: " + timeValid);
              
      
        
    }


    public static boolean areHoursValid(int hours) {
      boolean vh = false;
      
      if(0<=hours && hours<24){
        vh = true;
      } else{
        vh = false;

      }
        return vh;
    }


    public static boolean areMinutesValid(int minutes) {
      boolean vm = false;
      
      if(0<= minutes && minutes<60){
        vm = true;
        } else {
          vm = false;
        }
        return vm;
    }
}
