//Emre Soybas
//Homework 06
//TextSpinner.java
//This program emulates the old unix 'loading'.

public class TextSpinner {
    public static void main(String[] args) {
        //counter var
        int counter=1;
        while (counter == 1) {
            // /,-,\,|,/ repetition. \b will erase previous line
            System.out.print("/");
            System.out.print("\b\b\b\b\b\b\b");
            System.out.print("-");
            System.out.print("\b\b\b\b\b\b\b");
            System.out.print("\\");
            System.out.print("\b\b\b\b\b\b\b");
            System.out.print("|");
            System.out.print("\b\b\b\b\b\b\b");
            System.out.print("/");
            System.out.print("\b\b\b\b\b\b\b");

        }
    }
}