//Emre Soybas
import java.util.Scanner;
import java.util.Random;

public class RemoveElements {
    public static void main(String[] arg) {

        //Code that is already given to us in the homework
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index, target;
        String answer = "";
     
        do {
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
            String out = "The original array is:";
            out += listArray(num);
            System.out.println(out);
            //
            //index
            System.out.print("Enter the index ");
            index = scan.nextInt();
            newArray1 = delete(num, index);
            String out1 = "The output array is ";
            out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
            System.out.println(out1);
            //
            //target value
            System.out.print("Enter the target value ");
            target = scan.nextInt();
            newArray2 = remove(num, target);
            String out2 = "The output array is ";
            out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
            System.out.println(out2);
            //go again ot not
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }


    //the three methods that need to be written

    public static int[] delete(int list[], int pos) {
            int listlength1 = list.length - 1;
            int out1[] = new int[listlength1];
            //represnts length of array
            int out1length = out1.length;
            for (int x = 0; x < out1length; x++) {
                if (x >= pos) {
                    out1[x] = list[x + 1];
                }
                else {
                    out1[x] = list[x];
                }
            }
            //return the array
            return out1;
        } 

    //The randominput method 
    public static int[] randomInput() {
        Random randomNum = new Random();
        int rand[] = new int[10];
        //between 0 and 9
        for (int x = 0; x < 10; x++) {
            rand[x] = randomNum.nextInt(9);
        }
        //return the array
        return rand;
    }

    public static int[] remove(int list[], int target) {
        //Determines times user input target is in array
            int s = 0;
            int m = 0;
            int arrLength= list.length;
            for (int x = 0; x < arrLength; x++) {
                if (list[x] == target) {
                    s+=1;
                }
            }

          // new length of array depending on previous for loop
            int out2[] = new int[list.length - s];
            int out2length= out2.length;
            

        
            for (int x = 0; x < out2length; x++) {
               
                if (list[x] == target) {
                    m++;
                    out2[x] = list[m+x];
                }
                else {
                    out2[x] = list[m + x];
                }
            }
            // return the array
            return out2;
        } 

} 