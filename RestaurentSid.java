import java.util.*;
public class RestaurentSid{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String menuItem,D,S,M,De,input,bill;
        boolean input1=false;
        double totalBill = 0.0,gst;
        
        System.out.println("Welcome to the Restaurant!");
        
        do {
        	System.out.println("What Would you like to have? ");
        	System.out.println("-------------MAIN MENU------------");
        	System.out.println("Drinks = D");
        	System.out.println("Starter = S");
        	System.out.println("Main Course = M");
        	System.out.println("Dessert = De");
        	System.out.println("For Exit Type NO");
        	System.out.println("-----------------------------------");
       	

        	menuItem = sc.nextLine();
        	switch (menuItem) {
        	 case "D":
        	 {
        		 do {
     	        	
     	        	System.out.println("-------------ORDER YOUR DRINKS------------");
     	        	System.out.println("1. Tea- 20rs");
     	        	System.out.println("2. Coffee-30rs");
     	        	System.out.println("3. Coco Cola-45rs");
     	        	System.out.println("FOR MAIN MENU USE  0");
     	        	System.out.println("Enter your choice:");
     	        	
     	        	D = sc.nextLine();
        		 
        		 switch(D) {
        		 case "1":
	                case "Tea":
	                    totalBill += 20;
	                    break;
	                case "2":
	                case "Coffee":
	                    totalBill += 30;
	                    break;

	                case "3":
	                case "Coco Cola":
	                    totalBill += 45;
	                    break;

	                case "no":
	                    break;
	                default:
	                    System.out.println("Invalid selection. Please try again.");
	                    break;
        		 }//System.out.println("Do you want to add any other items?");
        	 }while (!D.equals("0"));
        		 break;
        		 }
        	
        	 case "S":
        	 {
        		 do {
     	        	
     	        	System.out.println("-------------ORDER YOUR STARTER------------");
     	        	System.out.println("1.Chikken Chilly- 175rs");
     	        	System.out.println("Enter your choice:");
     	        	System.out.println("For Main menu use 0");
     	        	S = sc.nextLine();
        		 
        		 switch(S) {
        		 case "1":
	                case "Chikken Chilly":
	                    totalBill += 175;
	                    break;
	                case "2":
	                case "Paneer Chilly":
	                    totalBill += 145;
	                    break;

	                case "3":
	                case "Crispy":
	                    totalBill += 150;
	                    break;

	                case "no":
	                    break;
	                default:
	                    System.out.println("Invalid selection. Please try again.");
	                    break;
        		 }System.out.println("Do you want to add any other items?");
        	 }while (!S.equals("0"));
        		 break;
        		 }

        	 case "M":
        	 {
        		 do {
     	        	
     	       	System.out.println("-------------ORDER YOUR COURSE------------");
     	        	System.out.println("1. Veg Handi- 200rs");
     	        	System.out.println("2. Chikken Handi-130rs");
     	        	System.out.println("3.Naan Roti-45rs");
     	        	System.out.println("Enter your choice:");
     	        	System.out.println("For Main menu use 0");
     	        	
     	        	M = sc.nextLine();
        		 
        		 switch(M) {
        		 case "1":
	                case "Veg Handi":
	                    totalBill += 200;
	                    break;
	                case "2":
	                case "Chikken Handi":
	                    totalBill += 130;
	                    break;

	                case "3":
	                case "Naan Roti":
	                    totalBill += 45;
	                    break;

	                case "no":
	                    break;
	                default:
	                    System.out.println("Invalid selection. Please try again.");
	                    break;
        		 }System.out.println("Do you want to add any other items?");
        	 }while (!M.equals("0"));
        		break; 
        		 }

        	 case "De":
        	 {
        		 do {
     	        
     	       	System.out.println("-------------ORDER YOUR DESSERT------------");
     	        	System.out.println("1. Gulab-Jamun - 20rs");
     	        	System.out.println("2. Kheer -30");
     	        	System.out.println("3 Gajar ka halwa-45");
     	        	System.out.println("Enter your choice:");
     	        	System.out.println("For Main menu use 0");
     	        	
     	        	De = sc.nextLine();
        		 
        		 switch(De) {
        		 case "1":
	                case "Gulab-Jamun":
	                    totalBill += 90;
	                    break;
	                case "2":
	                case "Kheer":
	                    totalBill += 30;
	                    break;

	                case "3":
	                case "Gajar ka halwa":
	                    totalBill += 50;
	                    break;

	                case "no":
	                    break;
	                default:
	                    System.out.println("Invalid selection. Please try again.");
	                    break;
	                    
        		 }System.out.println("Do you want to add any other items?");
        	 }while (!De.equals("0"));
        		 break;
        		 }

        	 }
                	
        	 
        
}while (!menuItem.equals("NO"));
     
        
	       
        System.out.println("Thank you for your order!");
        
        System.out.println("Your bill is:  RS. " +totalBill);//50RS
        gst=totalBill*18/100;//50
        totalBill=gst+totalBill;
        System.out.println("GST ADDED ON BILL IS: RS. " +gst);
        System.out.println("Your total bill is:  RS. " +totalBill);
        

}}