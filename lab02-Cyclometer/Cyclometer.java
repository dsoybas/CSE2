//Emre Soybas
//Lab 02
//Cyclometer Program

public class Cyclometer {
    //main method needed every Java program
    public static void main(String[] args)  {

int secsTrip1=480;  //number of seconds for trip 1
int secsTrip2=3220; //number of seconds for trip 2
int countsTrip1=1561; //number of counts for trip 1
int countsTrip2=9037; //number of counts for trip 2

double wheelDiameter=27.0, //Diameter of bike's wheel
PI=3.14159, //number PI used for calculation
feetPerMile=5280, //conversion factor mi to ft
inchesPerFoot=12, //conversion factor ft to in
secondsPerMinute=60; //conversion factor min to sec
double distanceTrip1, distanceTrip2,totalDistance; /*variales that represent 
distances of trip 1, trip 2, and total trip, respectively */

System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
" minutes and had "+countsTrip2+" counts.");
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above represents distance of trip 1 in inches
// For each count, wheel travels the diameter(inches) times PI

distanceTrip1/=inchesPerFoot*feetPerMile; //Distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distnace was "+totalDistance+" miles");
    }   //end of main metod
}   //end of class
