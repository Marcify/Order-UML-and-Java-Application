import java.util.Scanner;

public class MainOrder {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    // INSTANTIATION OF TWO ARRAYS OF ORDER OBJECTS
	    Order[] orders = new Order[2];
	    
	    // PROMPT
	    for(int i = 0; i < orders.length; i++) {
	        System.out.println("Customer " + (i+1) + " : ");
	        System.out.println("Enter Customer Order Details");
	        
	        System.out.print("Customer No : ");
	        int customerNumber = s.nextInt();
	        s.nextLine();
	        
	        System.out.print("Customer Name : ");
	        String customerName = s.nextLine();
	        
	        orders[i] = new Order(customerNumber, customerName);
	        
	        String[] itemDescription = new String[5];
	        double[] itemPrice = new double[5];
	        int[] itemQuantity = new int[5];
	        
	        System.out.println("Enter 5 items to purchase : ");
	        
	        for(int j = 1; j <= 5; j++) {
	            System.out.print("Enter " + j + " item : ");
	            itemDescription[j-1] = s.nextLine();
	            
	            System.out.print("Enter price of " + itemDescription[j-1] + " : Php ");
	            itemPrice[j-1] = s.nextDouble();
	            
	            System.out.print("Enter quantity : ");
	            itemQuantity[j-1] = s.nextInt();
	            s.nextLine();
	        }
	        
	        orders[i].setItemDescription(itemDescription);
	        orders[i].setItemPrice(itemPrice);
	        orders[i].setItemQuantity(itemQuantity);
	        
	        System.out.println();
	    }
	    
	    // CALL DISPLAY() METHOD
	    System.out.println("DISPLAYING ALL CUSTOMER ORDER DETAILS");
	    for(Order order : orders) {
	        order.display();
	    }
	}
}