package hardcoding;
import java.util.Scanner;

public class Main
{

  public static void main(String[]args) 
    {
     Scanner pos = new Scanner(System.in);
     String orderCart = "Your orders: \n";
     int respondToOrder,orderCategory;
     float totalPayment = 0, customerCash; 
      System.out.println("^^^^^^^ Meet the sweet & Unbeaten BBQ! ^^^^^^^^^^^^^^^^^^^");
      System.out.println("| Place your order? [1-YES, 2-NO]                        |");
      System.out.println("| Enter the number only!                                 |");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.print  ("Choice:");
      respondToOrder = pos.nextInt(); 
  
        do 
        {
           if (respondToOrder == 1) 
            {
  
	      System.out.println("^^^^^ Meet the sweet & Unbeaten BBQ! ^^^^^^^^^^^^");
	      System.out.println("|Order Now? [1-FOODS, 2 - BEVERAGES , 3-DESSERTS|");
	      System.out.println("| Enter the number choices!                     |");
	      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	      System.out.print  ("Choice:");
	      orderCategory = pos.nextInt();
	  
	      if(orderCategory == 1) 
                {
	         System.out.println("^^^^^^^ Meet the sweet & Unbeaten BBQ!   ^^^^^^^");
	         System.out.println("|---------------- FOODS -----------------------|");
	         System.out.println("| [1] chikenBBQ + Unli-Rice+Drinks : P289.00   |");
	         System.out.println("| [2] isawBBQ + Sisig          : P189.00       |");
	         System.out.println("| [3] unliWings + Rice+Drink       : P389.00   |");
	         System.out.println("| Enter the number choices!                    |");
	         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	         System.out.print  ("Choice:");
	         float chikenBBQ  = 289 , isawBBQ = 189, unliWings = 389;
	         int orderChoice = pos.nextInt();	    
	            switch (orderChoice) 
                    {
		     case 1: 
		      System.out.println("chikenBBQ + Unli-Rice+Drinks: P289.00 added to cart");
		      totalPayment+=chikenBBQ;
		      String order1  = "chikenBBQ + Unli-Rice+Drinks: P289.00:\n";
		      orderCart+=order1 ;
		     break;
		     case 2: 
		      System.out.println("isawBBQ + Sisig  : P189.00  added to cart");
		      totalPayment+=isawBBQ ;
		      String order2 = "isawBBQ + Sisig  : P189.00 :\n";
		      orderCart+=order2;  
		     break;
		     case 3: 
		      System.out.println("unliWings + Rice+Drink : P389.00  added to cart");
		      totalPayment+=unliWings ;
		      String order3 = "unliWings + Rice+Drink : P389.00 :\n";
		      orderCart+=order3;  
		     break;		
	             default:
		      System.out.println("Enter valid number only!");
	             break; 
	            }
	        } else if(orderCategory == 2) 
                {
	             System.out.println("^^^^^^^ Meet the sweet & Unbeaten BBQ! ^^^^^^^");
	             System.out.println("|--------------- BEVERAGES-------------------|");
	             System.out.println("| [1] 1-Bucket of Red Horse: P720.00         |");
	             System.out.println("| [2] 1-Tower of San Miguel Beer: P450.00    |");
	             System.out.println("| [3] Flavored Beer: P60.00                  |");
	             System.out.println("| Enter the number choices!                  |");
	             System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	             System.out.print  ("Choice:");
	             float redHorse = 310 , sanMiguel = 280, flavoredBeer = 180;
	             int orderChoice = pos.nextInt();	    
	            switch (orderChoice) 
                    {
		     case 1: 
		      System.out.println("1-Bucket of Red Horse: P720.00 added to cart");
		      totalPayment+=redHorse;
		      String order1 = "1-Bucket of Red Horse: P720.00 \n";
		      orderCart+=order1;		  
		     break;		
		     case 2: 
		      System.out.println("1-Tower of San Miguel Beer: P450.00   added to cart");
		      totalPayment+=sanMiguel;
		      String order2 = "1-Tower of San Miguel Beer: P450.00   \n";
		      orderCart+=order2;	  
		     break;		
		     case 3: 
		      System.out.println(" Flavored Beer: P60.00  added to cart");
		      totalPayment+=flavoredBeer;
		      String order3 = "Flavored Beer: P60.00  \n";
		      orderCart+=order3;  
		     break;	      
	             default:
		      System.out.println("Enter valid number only!");
	             break;  	      
	            }	    
	        }	    
	       else if(orderCategory == 3)
               {
	         System.out.println("^^^^^^^ Meet the sweet & Unbeaten BBQ! ^^^^^^^ ");
	         System.out.println("|--------- ORDER DESSERTS / PULUTAN ----------|");
	         System.out.println("| [1] Adobong Mani                  : P150.00 |");
	         System.out.println("| [2] Crispy Pata                   : P140.00 |");
	         System.out.println("| [3] Chicharon Bulaklak            : P130.00 |");
                 System.out.println("| [4] Macaroni Salad                : P100.00 |");
	         System.out.println("| [5] Mac and Cheese                : P100.00 |");
	         System.out.println("| [6] Mangofloat                    : P120.00 |");
	         System.out.println("| Enter the number choices!                   |");
	         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	         System.out.print  ("Choice:");	    
	         float adobongMani = 150 , crispyPatata = 140, chicharonBulaklak = 130, salad = 100, cheese = 120, mango=120;
	         int orderChoice = pos.nextInt();	    
	            switch (orderChoice) 
                    {
		     case 1: 
		      System.out.println("Adobong Mani                  : P150.00 added to cart");
		      totalPayment+=adobongMani;
		      String order1 = "Adobong Mani                  : P150.00  \n";
		      orderCart+=order1;
		     break;		
		     case 2: 
		      System.out.println("Crispy Pata                   : P140.00  added to cart");
		      totalPayment+=crispyPatata;
		      String order2 = "Crispy Pata                   : P140.00  \n";
		      orderCart+=order2;
		     break;		
		     case 3: 
		      System.out.println(" Chicharon Bulaklak            : P130.00  added to cart");
		      totalPayment+=chicharonBulaklak;
		      String order3 = "Chicharon Bulaklak            : P130.00 \n";
		      orderCart+=order3;
		     break;                
                     case 4: 
		      System.out.println(" Macaroni Salad                : P100.00   added to cart");
		      totalPayment+=salad;
		      String order4 = "Macaroni Salad                : P100.00  \n";
		      orderCart+=order4;  
		      break; 	      
                     case 5: 
		      System.out.println("Mac and Cheese                : P100.00 added to cart");
		      totalPayment+=cheese;
		      String order5 = "Mac and Cheese                : P100.00 \n";
		      orderCart+=order5; 
		     break;                 
                     case 6: 
		      System.out.println("Mangofloat                    : P120.00 added to cart");
		      totalPayment+=mango;
		      String order6 = "Mangofloat                    : P120.00 \n";
		      orderCart+=order6; 
		     break; 
	             default:
		      System.out.println("Enter valid number only !");		 
	             break;        
	            }
	        }
            }  
               else 
                {  
                 System.out.println("Okay! Have a nice day!~ 😉");
                 System.exit(0); 
                }
                 System.out.println("Order again?");
                 System.out.println("[1] - Yes");
                 System.out.println("[2] - No");
                 respondToOrder = pos.nextInt(); 
        }while(respondToOrder == 1);
         System.out.println("Amount to pay: "+totalPayment);
         System.out.print("Enter cash payment: ");
         customerCash = pos.nextFloat(); 
         System.out.println("------- R E C E I P T -------");
         System.out.println(orderCart);
         System.out.printf("TOTAL: %.2f\n",totalPayment);
         System.out.println("Change: " + (customerCash - totalPayment));
         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
         System.out.println("Thank you come again!");
    }
}