//Emre Soybas
//Hw 03- Pyramid.java
//This program finds the volume of a pyramid given values.
//Volume of pyramid= (l^2*h)/3

    //Scanner for input
    import java.util.Scanner;
    
    //defined class
    public class Pyramid {
        //added main method
        public static void main(String[] args){
            
    //Scanner for volume inputs
    Scanner myVolume = new Scanner(System.in);
    
    //Ask for length(square side)
    System.out.print("Enter the squre side of the pyramid(input length): ");
    
    //Square side
    double squareSide= myVolume.nextDouble();
    
    //Ask for height 
    System.out.print("Enter the height of the pyramid(input height): ");
    
    double height= myVolume.nextDouble();
    
    //Volume formula
    double pyramidVolume= ((squareSide*squareSide*height)/3);
    
    //Volume print out
    System.out.println("The volume inside the pyramid is "+pyramidVolume+"");
    
        }
        
    }