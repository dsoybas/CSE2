//Emre Soybas
//Lab 04 Card Generator
/*This program will generate random card draws from a 52 deck. it displays 
the suit and number of the card */



//defined class
public class CardGenerator {
    //added main class
    public static void main(String[] args) {

        //Generate random number
        //int randomCard=(int)(Math.random()*upperbound)+basenumber;

        int randomSuit = (int)(Math.random() * 52) + 1;
        String suitName = ("");
        String cardName = ("");
        

        //This gives the suits of the cards

        if (randomSuit >= 1 && randomSuit <= 13) {
            suitName = ("Hearts");
        }
        else if (randomSuit >= 14 && randomSuit <= 26) {
            suitName = ("Diamonds");
        }
        else if (randomSuit >= 27 && randomSuit <= 39) {
            suitName = ("Spades");
        }
        else if (randomSuit >= 40 && randomSuit <= 52) {
            suitName = ("Clubs");
        }
        
    
        //This will pick a number between 1-13 for each card. 
        String card_str = "";
        
        int randomNumber = (int)(Math.random() * 13 + 1);
        
        //Special cases for ace, jack, queen and king.
        switch(randomNumber){
            case 1:
                card_str = "Ace";
                break;
            case 11:
                card_str = "Jack";
                break;
            case 12:
                card_str = "Queen";
                break;
            case 13:
                card_str = "King";
                break;
        }
        
       
        //prints out randomNumber from 1 to 13- numbers 1,11,12,13 are ternary.
        switch (suitName) {
            case "Hearts":
                System.out.println("Your card is " + ((randomNumber > 1 && randomNumber < 11) ? randomNumber : card_str) + " of Hearts");
                break;
            case "Diamonds":
                System.out.println("Your card is " + ((randomNumber > 1 && randomNumber <11) ? randomNumber: card_str) + " of Diamonds");
                break;
            case "Spades":
                System.out.println("Your card is " + ((randomNumber > 1 && randomNumber <11) ? randomNumber: card_str)  + " of Spades");
                break;
            case "Clubs":
                System.out.println("Your card is " + ((randomNumber > 1 && randomNumber <11) ? randomNumber: card_str)  + " of Clubs");
                break;
        }
        
        


    }
}