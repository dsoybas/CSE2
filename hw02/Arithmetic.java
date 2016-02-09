//Emre Soybas
//HW 02 - Arithmetic

//defined class
public class Arithmetic {
    //added main method
    public static void main(String[] args) {
    
   //number of pairs of pants
    int numPants = 3;
  
   //price of one pair of pants
    double pantsPrice = 34.98;
   
    //number of sweatshirts
    int numShirts = 2;
  
    //price of each sweatshirt
    double shirtPrice = 24.99;
   
    //number of belts
    int numBelts = 1;
   
    //price of a belt
    double beltPrice = 33.99;
   
    //tax on goods
    double salesTax= 0.06;
   
    //Total cost of pants
    double totalPantsPrice= numPants*pantsPrice;
   
    //Total cost of sweatshirts
    double totalShirtPrice= numShirts*shirtPrice;
    
    //Total cost of belts
    double totalBeltPrice= numBelts*beltPrice;
   
    //Sales Tax of each item
    double pantsSalesTax= totalPantsPrice*salesTax,
    
    shirtSalesTax=totalShirtPrice*salesTax,
    
    beltSalesTax=totalBeltPrice*salesTax;

    //Doubles to Integers
    /////////////////////
    //Answer times 100
    pantsSalesTax=100*pantsSalesTax;
    shirtSalesTax=100*shirtSalesTax;
    beltSalesTax=100*beltSalesTax;
    //Convert into integer
    int pantsSalesTaxint = (int) pantsSalesTax;
    int shirtSalesTaxint= (int) shirtSalesTax;
    int beltSalesTaxint= (int) beltSalesTax;
    //Back to double, divide by 100. SalesTaxTot= end tax in $X.XX
    double pantsSalesTaxTot= (double) pantsSalesTaxint / 100;
    double shirtSalesTaxTot=(double) shirtSalesTaxint / 100;
    double beltSalesTaxTot=(double) beltSalesTaxint / 100; 
   

    //Output of total cost of item (no sales tax) + sales tax for that item
    //Pants
    System.out.println("The total cost of pants is "+totalPantsPrice+", with a sales tax of "+pantsSalesTaxTot+"");
    //Sweatshirt
    System.out.println("The total cost of shirt is "+totalShirtPrice+", with a sales tax of "+shirtSalesTaxTot+"");
    //Belt
    System.out.println("The total cost of belt is "+totalBeltPrice+", with a sales tax of "+beltSalesTaxTot+"");
    
    //Cost of each item with sales tax included
    double endPantsPrice= (totalPantsPrice+pantsSalesTaxTot),
    
    endShirtPrice=(totalShirtPrice+shirtSalesTaxTot) ,
    
    endBeltPrice=(totalBeltPrice+beltSalesTaxTot) ;
   
   //Total cost of purchase before tax
   double totalCostNoTax= (totalPantsPrice+totalShirtPrice+totalBeltPrice);
   
   //The Total Sales Tax
   double totalSalesTax= (pantsSalesTaxTot+shirtSalesTaxTot+beltSalesTaxTot);
   
   //Total cost of purchase with tax
   double totalCostWithTax= (endPantsPrice+endShirtPrice+endBeltPrice);
   
   //Output of total cost of purchase without tax
    System.out.println("The total cost of the purchases before tax is "+totalCostNoTax+"");
    
   //Output of total sales tax
    System.out.println("The total sales tax is "+totalSalesTax+"");
    
   //Output of total cost of purchase with tax
    System.out.println("The total cost of the purchase with tax is "+totalCostWithTax+"");
    }
   
    
}