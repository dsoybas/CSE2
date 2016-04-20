//Emre Soybas
//This program will take 15 grades of exams and sort them, then will search for
//a specific grade
//Grades must be between 0-100

import java.util.Scanner;
import java.util.Random;
//Array utility
import java.util.Arrays;


public class CSE2Linear {
    public static void main(String[] args) {
        //declare array
        int[] myGrades = new int[15];
        System.out.println("Please enter 15 grades as ints.");
        //declare scanner
        Scanner scan = new Scanner(System.in);

        //for loop used for the unsorted array
        for (int i = 0; i < myGrades.length; i++) {

            scan = new Scanner(System.in);
            //if not an integer
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Not an integer.");
            }

            //Correct condition
            int num = scan.nextInt();
            if (num < 101 && num > -1) {

                myGrades[i] = num;
            }
            //if not btwn 0-100
            if (num > 100 || num < 0) {
                System.out.println("Grade is not btwn 0-100.");

            }
            int newnum= scan.nextInt();
            
            if(num>newnum){
                System.out.println("Error.Number must bre greater than or equal to the last one entered");
            }
        }

        //print out the unsorted array
        System.out.println("Unsorted arary:");
        //can use arrays.tostring to print out one dimensional array
        System.out.println(Arrays.toString(myGrades));

        //declare vars to use for sorting array
        int i, j, sort;
        //sorted array for loop
        for (i = 0; i < myGrades.length - 1; i++) {
            for (j = i + 1; j < myGrades.length; j++) {
                if (myGrades[i] > myGrades[j]) {
                    sort = myGrades[i];
                    myGrades[i] = myGrades[j];
                    myGrades[j] = sort;
                }
            }

        }
        //print out the sorted array
        System.out.println("Sorted array:");
        //use arrays.tostring bc one dimensional array
        System.out.println(Arrays.toString(myGrades));

        //LINEAR SEARCH
        System.out.println("Enter a grade to search for: ");
        int search = scan.nextInt();
        boolean flag = false;
        int counter=0;
        for (i = 0; i < myGrades.length; i++) {
            counter++;
            if (myGrades[i] == search) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(search + " is found in the array.");
            System.out.println("Iterations used: "+counter+"");
        }
        else {
            System.out.println(search + " not found in the array.");
            System.out.println("Iterations used: "+counter+"");
           
        }


        //SCRAMBLED ARRAY
        for (i = 0; i < myGrades.length; i++) {
            int s = i + (int)(Math.random() * (myGrades.length - i));
            int val = myGrades[s];
            myGrades[s] = myGrades[i];
            myGrades[i] = val;
        }
        //print out the scrambled array
        System.out.println("Scrambled array:");
        System.out.println(Arrays.toString(myGrades));

       //Linear search for scrambled array.
        System.out.println("Enter a grade to search for: ");
         search = scan.nextInt();
         flag = false;
        counter=0;
        for (i = 0; i < myGrades.length; i++) {
            counter++;
            if (myGrades[i] == search) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(search + " is found in the array.");
            System.out.println("Iterations used: "+counter+"");
        }
        else {
            System.out.println(search + " not found in the array.");
            System.out.println("Iterations used: "+counter+"");
           
        }    
    }
}
