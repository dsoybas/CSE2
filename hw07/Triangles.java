//Emre Soybas
//Hw 07
//Triangles.java

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner myTri = new Scanner(System.in);
        
        
        //number between 5 and 30
        System.out.print("Please enter a number between 5 and 30:");
        
        int num1 = myTri.nextInt();
        //number must be between 5 and 30. if statement for tht with while loop
        if (num1 < 5 || num1 > 30) {
            while (num1 < 5 || num1 > 30) {
                System.out.println("Please enter a number between 5 and 30:");
                num1 = myTri.nextInt();
            }

        }
        int counter1 = 1;
        int counter2 = 1;
        
        //For loop!
        
        System.out.println("FOR LOOP:");

        for (counter2 = 1; counter2 <= num1; counter2++) {
            for (counter1 = 1; counter1 <= counter2; counter1++) {
                System.out.print(counter2);
            }
            System.out.println("");
        }


        for (int num2 = (num1 - 1); num2 >= 0; num2--) {
            for (counter1 = num2 - 1; counter1 >= 0; counter1--) {
                System.out.print(num2);
            }
            System.out.println("");


        }



        //While loop!
        counter2 = 1;
        System.out.println("WHILE LOOP:");

        while (counter2 <= num1) {
            counter1 = 1;
            while (counter1 <= counter2) {
                System.out.print(counter2);
                counter1++;

            }
            System.out.println("");
            counter2++;
        }

        int num2 = (num1 - 1);
        counter1 = (num2 - 1);

        while (num2 >= 0) {
            counter1 = (num2 - 1);
            while (counter1 >= 0) {
                System.out.print(num2);
                counter1--;
            }
            num2--;
            System.out.println("");

        }
        //Do while loop
        System.out.println("DO-WHILE LOOP:");
        counter2 = 1;
        do {
            counter1 = 1;

            do {
                System.out.print(counter2);
                counter1++;
            } while (counter1 <= counter2);
            System.out.println("");
            counter2++;
        } while (counter2 <= num1);

        num2 = (num1 - 1);
        counter1 = (num2 - 1);

        do {
            counter1 = (num2 - 1);
            do {
                System.out.print(num2);
                counter1--;
            } while (counter1 >= 0);
            num2--;
            System.out.println("");
        } while (num2 > 0);



    }
}
