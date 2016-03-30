//Emre Deniz Soybas
//Hw 09
//Games.java

import java.util.Random;
import java.util.Scanner;

public class Games {
    //Main method
    public static void main(String[] args) {
        Scanner myChoice = new Scanner(System.in);

        System.out.println("Welcome to the Deniz Game Center!");
        System.out.println("Type in 1 for guessTheBox");
        System.out.println("Type in 2 for spinTheWheel");
        System.out.println("Type in 3 for scrambler");
        int gameNum = myChoice.nextInt();
        if (gameNum == 1) {
            String Box = guessTheBox();
            System.out.println(Box);
        }
        if (gameNum == 2) {
            String MyColor = spinTheWheel1();
            String ColorNum = spinTheWheel2();
            System.out.println("Spinner is spinning.Please wait.");
            System.out.println(MyColor);
            System.out.println(ColorNum);
            
        }
        if (gameNum == 3){
            String MyWords=scrambler();
            System.out.println("Word is scrambling.Please wait.");
            System.out.println(MyWords);
        }


    }

    //First Game- guess the box
    public static String guessTheBox() {
        String Box = ("");
        Scanner myBox = new Scanner(System.in);
        Random myRandom = new Random();
        System.out.println("The prize is in a random box, guess!");
        System.out.println("Enter 1 for Box 1, 2 for Box 2 and 3 for Box 3.");
        int boxNum = myBox.nextInt();
        if (boxNum != 1 && boxNum != 2 && boxNum != 3) {
            while (boxNum != 1 && boxNum != 2 && boxNum != 3) {
                System.out.println("Error.Enter 1 for Box 1, 2 for Box 2 and 3 for Box 3.");
                boxNum = myBox.nextInt();
            }
        }

        int prizeNum = myRandom.nextInt(3);
        if (boxNum == prizeNum) {

            Box = ("Congrats! You get a high five!");
        }
        else if (boxNum != prizeNum) {
            Box = ("Sorry bro.You lost.");
        }
        return Box;

    }

    //Second game spin the wheel
    public static String spinTheWheel1() {
        String Color = "";
        String MyColor = ("");
        String red = "red";
        String black = "black";
        Scanner myColor = new Scanner(System.in);
        Random randomColor = new Random();
        System.out.println("Enter color red or black");
        MyColor = myColor.next();
        if (!MyColor.equals(red) && !MyColor.equals(black)) {
            while (!MyColor.equals(red) && !MyColor.equals(black)) {
                System.out.println("Error.Enter color red or black");
                MyColor = myColor.next();
            }
        }
        int colorOut = randomColor.nextInt(2);
        if (colorOut == 0) {
            Color = red;
        }
        if (colorOut == 1) {
            Color = black;
        }
        if (Color.equals(MyColor)) {
            MyColor = ("Random color is " + Color + ". It matches your color choice of " + MyColor + ".");
        }
        else if (!Color.equals(MyColor)) {
            MyColor = ("Random color is " + Color + ".It does NOT match your choice of " + MyColor + ".");
        }
        return MyColor;
    }


    public static String spinTheWheel2() {
        String ColorNum = "";
        Scanner numColor = new Scanner(System.in);
        Random randoNum = new Random();
        System.out.println("Enter a guess between 1-5.");
        int MyNumber = numColor.nextInt();
        int RandomNumber = randoNum.nextInt(6);
        if (MyNumber == RandomNumber) {
            ColorNum = ("You guessed correct.Your choice was " + MyNumber + "and it matches " + RandomNumber + "");
        }
        else if (MyNumber != RandomNumber) {
            ColorNum = ("You guessed wrong.Your choice was " + MyNumber + " and it does not match " + RandomNumber + ".");
        }
        return ColorNum;
    }
    
    public static String scrambler(){
        String MyWords="";
        Scanner myWord= new Scanner(System.in);
        Random randomWord1= new Random();
        System.out.println("Enter any word you please.");
        String Word= myWord.next();
        
        //scramble
        for(int counter=0; counter<Word.length(); counter++){
            int FirstWord= randomWord1.nextInt(Word.length());
            Character newChar= Word.charAt(FirstWord);
            
            Word= Word.replace(newChar,Word.charAt(0));
            Word= Word.replaceFirst(((Character)Word.charAt(0)).toString(), newChar.toString());
        }
        
        MyWords=Word;
        return MyWords;

       
        
        
    }




}
