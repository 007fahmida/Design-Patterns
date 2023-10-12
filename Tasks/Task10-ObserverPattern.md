# Scenario :

## Imagine you are working on an e-commerce platform called "FlipKart," where customers can receive real-time notifications about the availability of products they are interested in. The given code implements the Observer design pattern for this purpose.

```java
import java.util.ArrayList;
import java.util.List;

// Subject interface to manage observers
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete subject class (product) implementing the Subject interface
class Product implements Subject {
    private List<Observer> customers;
    private String productName;
    private String productType;
    private String productPrice;
    private String availability;

    public Product(String productName, String productType, String productPrice, String availability) {
        customers = new ArrayList<>();
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        System.out.println("Availability changed from Not Available to Available");
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        System.out.println("Product Name: " + this.productName + ", Product Type: " + this.productType +
                ", Product Price: " + this.productPrice + " is available now. Notifying all the users.");
        for (Observer customer : customers) {
            customer.update(this.availability);
        }
    }
}

// Observer interface with the update method
interface Observer {
    void update(String availability);
}

// Concrete observer class (customer) implementing the Observer interface
class Customer implements Observer {
    private String customerName;

    public Customer(String customerName, Subject subject) {
        this.customerName = customerName;
        subject.addObserver(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + this.customerName + ", Product is now " +
                availability + " on Flipkart");
    }
}

// Main class to demonstrate the Observer pattern
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Product samsungLEDTV = new Product("Samsung LED TV", "LED TV", "60000Rs", "Not available");
        Customer david = new Customer("David", samsungLEDTV);
        Customer john = new Customer("John", samsungLEDTV);

        // Changing product availability to demonstrate notifications
        samsungLEDTV.setAvailability("Available");
    }
}
```
