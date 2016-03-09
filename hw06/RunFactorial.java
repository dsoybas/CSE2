//Emre Soybas
//Hw 06
//RunFactorial.java
//This program will give factorial of any number between 9 and 16, inclusive.
//Errors will be given if those numbers arent entered

//import scanner
import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        
        //defined scanner
        Scanner myFactorial = new Scanner(System.in);
        
        //define variables, and ask for integer btwn 9-16
        int factorial = 1, number, counter = 1;
        System.out.println("Please enter an integer between 9 and 16.");
        number = myFactorial.nextInt();
        
        //while loop for regular condition(if user inputs btwn 9 and 16)
        while (number >= 9 && number <= 16) {
            while (counter<=number) {
                factorial = factorial * counter;
                counter++;
            }
           System.out.println("Input accepted." + number + "!:" + factorial + "");
           break;
        }
        
        //while loop for irregular condition(if user doesnt input btwn 9 and 16)
        while (number < 9 || number > 16) {
            System.out.println("Integer not valid.Enter again!");
            number = myFactorial.nextInt();
            if (number >= 9 && number <= 16) {
                while (counter<=number) {
                    factorial = factorial * counter;
                    counter++;
                }
                System.out.println("Input accepted." + number + "!:" + factorial + "");
            }
        }
    }

}
