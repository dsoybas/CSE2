//Emre Soybas
//Hw 07
//Twisty.java 

import java.util.Scanner;

public class Twisty {
    public static void main(String[] args) {

        Scanner myTwist = new Scanner(System.in);
        
        //Input for your length
        System.out.println("Input your desired length: ");
        int length = myTwist.nextInt();
        //Reject length if its greater than 80
        if (length > 80) {
            while (length > 80) {
                System.out.println("Length must be less than 80.Enter again.");
                length = myTwist.nextInt();
            }
        }
        //Input again
        System.out.println("Input your desired width: ");
        int width = myTwist.nextInt();

        int tracker1 = 0;
        //Condition if length is less than width. Enter again.
        if (width > length) {
            while (width > length) {
                System.out.println("Error.Please enter width less than length");
                System.out.println("Input your desired width: ");
                width = myTwist.nextInt();
            }
        }
        
        
        int tracker2=0;
        for (int counter1 = 1; counter1 <= width; counter1++) {
            tracker1 = length; //char remaining>2* width
             //pattern length
            while (tracker1 > 0) {
                if ((tracker1 > 2*width)) {
                    tracker1 = width * 2;
                }
                else{
                    tracker2=tracker1;
                }
            
                for (int counter2 = 0; counter2 < tracker2; counter2++) {

                    if ((tracker2 - 1) == counter2) {
                        System.out.print("#");
                    }
                    else if (width - counter1 == counter2) {
                        System.out.print("/");
                    }
                    else if (width + (counter1 - 1) == counter2) {
                        System.out.println("\\");
                    }
                    else if ((width * 2) - counter1 == counter2) {
                        System.out.print("#");
                    }

                    else {
                        System.out.print("");
                    }
                    tracker1 = tracker1 - tracker2;


            }
            System.out.println("");




        }


    }
}
}
