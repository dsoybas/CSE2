//Emre Soybas
//Lab 03
//Check.java
    //Scanner Declare
    import java.util.Scanner;
    
    //main method
    public class Check {
        public static void main(String[] args) {
            
    //Scanner
    Scanner myCheck= new Scanner(System.in);
    
    //Prompt check cost
    System.out.print("Enter the original cost of the check in the form xx.xx: ");
    
    //Check cost
    double checkCost= myCheck.nextDouble();
    
    //Prompt
    System.out.print
    ("Enter the percentage tip you wish to pay as a whole number in the form xx: ");
    
    //Percent tip
    double percentTip= myCheck.nextDouble();
    
    //Convert tip to decimal value
    percentTip /= 100;
    
    //Number of people that went to dinner prompt
    System.out.print("Enter the amount of people that went to dinner: ");
    
    //Declare
    int numberPeople= myCheck.nextInt();
    
    //
    double totalCost;
    double costPerPerson;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits
        //to the right of the cost $
    
    totalCost= checkCost * (1+percentTip);
    costPerPerson=totalCost/ numberPeople;
    //drop decimal fraction
    dollars=(int)costPerPerson;
    //get dimes amount, e.g., 
    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
    //  where the % (mod) operator returns the remainder
    //  after the division:   583%100 -> 83, 27%5 -> 2 

    dimes=(int) (costPerPerson*10) % 10;
    pennies=(int) (costPerPerson*100) % 10;
    System.out.println
    ("Each person in the group owes $" +dollars+ '.' +dimes + pennies);
    
         }
    }