//Emre Soybas
//Rectangularize.java
//Homework 9

import java.util.Scanner;

public class Rectangularize {

    public static void main(String[] args) {
        Scanner myWord = new Scanner(System.in);
        String Word = "";
      

        System.out.println("Enter any word you would like.");

        Word = myWord.next();


        int wordLength = Word.length();

        rectangle(wordLength);

        rectangle(Word);

    }

    public static void rectangle(int wordLength) {
        for (int counterColumn = 0; counterColumn < wordLength;counterColumn++) {
            System.out.println("");
            for (int counterRow = 0; counterRow < wordLength;counterRow++) {
                System.out.print("%");
            }
            System.out.println("");
        }
    }

    public static void rectangle(String lengthWord) {
        String Word="";
        int Characters = Word.length();
        for (int counterColumn = 0; counterColumn < Characters;) {
            System.out.println(Word);

        }
        System.out.println("");
    }
}