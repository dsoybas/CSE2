//Emre Soybas
//Hw 06

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myFib = new Scanner(System.in);

        //The three input statements and The three numbers that are entered
        System.out.print("Enter the first number in the sequence: ");
        int inputOne = myFib.nextInt();
        System.out.print("Enter the second number in the sequence: ");
        int inputTwo = myFib.nextInt();
        System.out.print("How many custom Fibonacci numbers should be printed? ");
        int customNumber = myFib.nextInt();
        //Counter variable
        int customNumberOut = 1;

        while (inputOne < 0 || inputTwo < 0 || customNumber < 0) {
            //Print statement for output
            System.out.println("Number is not a positive integer.Enter Again.");
            //The three input statements and The three numbers that are entered
            System.out.print("Enter the first number in the sequence: ");
            inputOne = myFib.nextInt();
            System.out.print("Enter the second number in the sequence: ");
            inputTwo = myFib.nextInt();
            System.out.print("How many custom Fibonacci numbers should be printed? ");
            customNumber = myFib.nextInt();
            //Regular condition after user inputs a negative number.
            if (customNumber > 0 && inputOne > 0 && inputTwo > 0) {
                while (customNumberOut <= customNumber) {
                    System.out.print(inputOne + ",");
                    int finalNumber = inputOne + inputTwo;
                    inputOne = inputTwo;
                    inputTwo = finalNumber;
                    customNumberOut++;
                }

            }
        }
        //Regular condition.
        while (customNumberOut <= customNumber) {
            System.out.print(inputOne + ",");
            int finalNumber = inputOne + inputTwo;
            inputOne = inputTwo;
            inputTwo = finalNumber;
            customNumberOut++;

            


        }
        //Final . 
            System.out.print(".");
    }
}