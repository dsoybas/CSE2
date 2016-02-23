//Emre Soybas
//Hw 04 
//ToHex.java
//This code will take 3 decimal values and convert them to hexadecimal values.

import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        //Scanner
        Scanner myHex = new Scanner(System.in);
        //Output- enter 3 
        System.out.print("Please enter three numbers representing RGB Values: ");
        //These will represent the switch statements' strings
        String hexString1 = ("");
        String hexString2 = ("");
        String hexString3 = ("");
        String remString1 = ("");
        String remString2 = ("");
        String remString3 = ("");

        //The three numbers entered
        int numberOne = myHex.nextInt();
        int numberTwo = myHex.nextInt();
        int numberThree = myHex.nextInt();
        
        //Error in system- numbers entered can't be above 255 or below 0
        if (numberOne > 255 || numberOne < 0 || numberTwo > 255 || numberTwo < 0 || numberThree > 255 || numberThree < 0) {
            System.out.println("Sorry.The numbers entered are not RGB values.");
            //I looked up system.exit- not sure if we learned it or not.
            System.exit(1);
        }
        //Conversion factor for hexadecimals
        int numberOneHex = (numberOne / 16);
        int numberTwoHex = (numberTwo / 16);
        int numberThreeHex = (numberThree / 16);
        //Conversion factor for heaxdecimals
        int numberOneRem = (numberOne % 16);
        int numberTwoRem = (numberTwo % 16);
        int numberThreeRem = (numberThree % 16);
        
        

        //Switch statements for the first part of hexadecimal conversion
        switch (numberOneHex) {
            case 10:
                hexString1 = "A";
                break;
            case 11:
                hexString1 = "B";
                break;
            case 12:
                hexString1 = "C";
                break;
            case 13:
                hexString1 = "D";
                break;
            case 14:
                hexString1 = "E";
                break;
            case 15:
                hexString1 = "F";
                break;
        }
        switch (numberTwoHex) {
            case 10:
                hexString2 = "A";
                break;
            case 11:
                hexString2 = "B";
                break;
            case 12:
                hexString2 = "C";
                break;
            case 13:
                hexString2 = "D";
                break;
            case 14:
                hexString2 = "E";
                break;
            case 15:
                hexString2 = "F";
                break;
        }
        switch (numberThreeHex) {
            case 10:
                hexString3 = "A";
                break;
            case 11:
                hexString3 = "B";
                break;
            case 12:
                hexString3 = "C";
                break;
            case 13:
                hexString3 = "D";
                break;
            case 14:
                hexString3 = "E";
                break;
            case 15:
                hexString3 = "F";
                break;
        }
        //Switch statements for the second part of hexadecimal conversions
        switch (numberOneRem) {
            case 10:
                remString1 = "A";
                break;
            case 11:
                remString1 = "B";
                break;
            case 12:
                remString1 = "C";
                break;
            case 13:
                remString1 = "D";
                break;
            case 14:
                remString1 = "E";
                break;
            case 15:
                remString1 = "F";
                break;
        }
        switch (numberTwoRem) {
            case 10:
                remString2 = "A";
                break;
            case 11:
                remString2 = "B";
                break;
            case 12:
                remString2 = "C";
                break;
            case 13:
                remString2 = "D";
                break;
            case 14:
                remString2 = "E";
                break;
            case 15:
                remString2 = "F";
                break;
        }
        switch (numberThreeRem) {
            case 10:
                remString3 = "A";
                break;
            case 11:
                remString3 = "B";
                break;
            case 12:
                remString3 = "C";
                break;
            case 13:
                remString3 = "D";
                break;
            case 14:
                remString3 = "E";
                break;
            case 15:
                remString3 = "F";
                break;
        }
        
        //Final print out statement. Used ternary operators.
        System.out.println("The Decimal Numbers  "+ numberOne + ": " + numberTwo + ": " + numberThree +" is represented in hexadecimal as " +((numberOneHex>0 && numberOneHex<10) ? numberOneHex: hexString1)+""+((numberOneRem>0 && numberOneRem<10) ? numberOneRem: remString1)+" "+((numberTwoHex>0 && numberTwoHex<10) ? numberTwoHex: hexString2)+""+((numberTwoRem>0 && numberTwoRem<10) ? numberTwoRem: remString2)+" "+((numberThreeHex>0 && numberThreeHex<10) ? numberThreeHex: hexString3)+""+((numberThreeRem>0 && numberThreeRem<10) ? numberThreeRem: remString3)+"");
    }
}   