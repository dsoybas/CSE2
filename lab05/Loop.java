//Emre Soybas
//Lab 05
//For,while,do-while loops


import java.util.Scanner;

//define class
    public class Loop {
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            int num=0;
            int numSum=0;
            if(input.hasNextInt()){
                num=input.nextInt();
            }
            else{
                System.out.println("Invalid input");
                input.next(); //need this bc the hasNextInt() does not read
            }               //the input. The input stays in the buffer until it 
                            //is read
            
            while(num>100){ //Example:234
                num = num%10; //gives last digit 4
                numSum=numSum+num;
                System.out.println(num);
                num = num/10; //drops last digit so gives 23
                num = num%10; //gives middle digit 3
                numSum=numSum+num;
                System.out.println(num);
                num = num/10; //drops middle digit so gives 2
                numSum=numSum+num;
                System.out.println(num);
                //so you must add num1+num3+num4 to get sum.
            
              
               System.out.println("Sum= "+numSum+"");
               
                    
            }
        }
    }