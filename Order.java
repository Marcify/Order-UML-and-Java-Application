public class Order {
    private int customerNumber;
    private String customerName;
    private String[] itemDescription = new String[5];
    private double[] itemPrice = new double[5];
    private int[] itemQuantity = new int[5];
    
    // CONSTRUCTOR
    public Order(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.itemDescription = new String[5];
        this.itemPrice = new double[5];
        this.itemQuantity = new int[5];
    }
    
    // SETTERS
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void setItemDescription(String[] itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    public void setItemPrice(double[] itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public void setItemQuantity(int[] itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    // GETTERS
    public int getCustomerNumber() {
        return customerNumber;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String[] getItemDescription() {
        return itemDescription;
    }
    
    public double[] getItemPrice() {
        return itemPrice;
    }
    
    public int[] getItemQuantity() {
        return itemQuantity;
    }
    
    // DISPLAY() METHOD
    public void display() {
        double total = 0;
        double compute = 0;
        
        System.out.println("Displaying Customer Order Details");
        System.out.println("Customer No : "  + customerNumber);
        System.out.println("Customer Order of " + customerName + " : ");
        
        for(int i = 0; i < 5; i++) {
            System.out.println("    Item " + (i+1) + " : " + itemDescription[i]);
            System.out.println("    Price : Php " + itemPrice[i]);
            System.out.println("    Quantity : " + itemQuantity[i]);
            System.out.println("    Sub-total price of " + itemDescription[i] + " : Php " + itemPrice[i] * itemQuantity[i]);
            compute = itemPrice[i] * itemQuantity[i];
            total += compute;
        }
        
        System.out.println("**************************************************");
        System.out.println("Total purchase by customer " + customerName + " : Php " + total);
        System.out.println("**************************************************");
        System.out.println();
        
    }
}