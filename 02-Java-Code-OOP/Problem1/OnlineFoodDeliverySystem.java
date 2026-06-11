class FoodItem {
    int itemId;
    String itemName;
    double price;
    int quantity;

    FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateAmount() {
        return price * quantity;
    }

    void displayItemDetails() {
        System.out.println("Item ID: " + itemId +
                           ", Name: " + itemName +
                           ", Price: " + price +
                           ", Quantity: " + quantity +
                           ", Amount: " + calculateAmount());
    }
}

class Customer {
    int customerId;
    String customerName;
    String mobileNumber;

    Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId +
                           ", Name: " + customerName +
                           ", Mobile: " + mobileNumber);
    }
}


public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem(101, "Pizza", 250.0, 2);
        FoodItem item2 = new FoodItem(102, "Burger", 120.0, 3);
        FoodItem item3 = new FoodItem(103, "Pasta", 180.0, 1);
        FoodItem item4 = new FoodItem(104, "Cold Drink", 50.0, 4);

        Customer cust1 = new Customer(1, "Sarthak", "9876543210");
        Customer cust2 = new Customer(2, "Rishabh", "9123456780");

        System.out.println("\n--- Food Items Ordered ---");
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
        item4.displayItemDetails();

        double totalBill = item1.calculateAmount() + item2.calculateAmount() +
                           item3.calculateAmount() + item4.calculateAmount();

        System.out.println("\n--- Customer Details ---");
        cust1.displayCustomerDetails();

        System.out.println("\n--- Order Summary ---");
        System.out.println("Customer: " + cust1.customerName);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}
