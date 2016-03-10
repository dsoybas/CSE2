//Emre Soybas
//Lab 06
//TwistGenerator.java
    import java.util.Scanner;
    
    public class TwistGenerator{
        public static void main(String[] args){
            
            Scanner myLength= new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            
            int length= myLength.nextInt();
            int lengthThird=length/3;
        
            System.out.print("\n                ");
            System.out.print("\\");
            for(int lengthOut=1; lengthOut<=lengthThird;){
                System.out.print(" /\\ ");
                lengthOut++;
                 
               
            }
            System.out.print("\n                ");
            
            for(int lengthOut=1; lengthOut<=lengthThird;){
                System.out.print("  X ");
                lengthOut++;
                
                
            }
            System.out.print("\n                ");
            System.out.print("/");
            
            for(int lengthOut=1; lengthOut<=lengthThird;){
                System.out.print(" \\/ ");
                lengthOut++;
            }
            
        
    }
        
    }
    