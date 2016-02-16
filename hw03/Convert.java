//Emre Soybas
//hw03
//Convert.java
//This program will convert any distance in meters to inches.

//Scanner for input
import java.util.Scanner;
//defined class
public class Convert {
        //added main method
        public static void main(String[] args) {
  
    //Scanner for meter inputs
    Scanner myMeters = new Scanner (System.in);
    
    //Ask for meters
    System.out.print("Enter the distance in meters in the form xx.xx: ");

    //34.23 Meters
    double metersOne= myMeters.nextDouble();
    //Meters to Inches 1 meter is 39.3701 inches
    double inchesOne= metersOne * 39.3701;
    //Four decimal places
    inchesOne=inchesOne*10000;
    int inchesOneInt= (int) inchesOne;
    double inchesOneTot=(double) inchesOneInt /10000;
     //Display the results
    System.out.println("34.23 meters is "+inchesOneTot+" inches.");
    
    //Ask for meters
    System.out.print("Enter the distance in meters in the form xx.xx: ");
    //15.25 Meters
    double metersTwo= myMeters.nextDouble();
    double inchesTwo= metersTwo * 39.3701;
    //Four decimal places
    inchesTwo=inchesTwo*10000;
    int inchesTwoInt=(int) inchesTwo;
    double inchesTwoTot=(double) inchesTwoInt / 10000; 
    
    //Display the results
    System.out.println("15.25 meters is "+inchesTwoTot+" inches.");
    
            
        }
    }