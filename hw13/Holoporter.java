//Emre Soybas
//hw 13- holoporter.java

import java.util.Scanner;
import java.util.Random;

public class Holoporter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        coder();
        
    
    }
    public static String[][][] soRandom() {
        String array[][][];
        //length between 1-10
        int arraySize1 = (int)(Math.random() * 11);
        int arraySize2 = (int)(Math.random() * 11);
        int arraySize3 = (int)(Math.random() * 11);
        array = new String[arraySize1][arraySize2][arraySize3];

        return array;

    }

    public static String coder() {
        String array[][][]=soRandom();
        Random r = new Random();
        //Random chars for first two, from a-z.
        //XX
        char a = (char)(r.nextInt(26) + 'A');
        char b = (char)(r.nextInt(26) + 'A');
        while (a == b) {
            //if a equals b, change b.
            b = (char)(r.nextInt(26) + 'A');
        }
        //random ints
        //YYYY
        int one = (r.nextInt(9));
        int two = (r.nextInt(9));
        int three = (r.nextInt(9));
        int four = (r.nextInt(9));

        String end = ("{" + a + "" + b + "" + one + "" + two + "" + three + "" + four + "");
        System.out.print("{" + a + "" + b + "" + one + "" + two + "" + three + "" + four + "}, ");
        
          for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++){
                   array[i][j][k] = coder();  
            }
           
        }
    }

        return end;
        
       

    }

    //public static String[][][] print(String[][][] array) {
        
        
}


