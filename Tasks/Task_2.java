class Vehicle 
{
    // Variable declaration with access modifier
    protected String name; 

    // Constructor with parameter
    public Vehicle(String name) { 
        this.name = name;
    }
    
    // Method without parameters
    public void drive() { 
        System.out.println(name + " is being driven.");
    }
}
class Toyota extends Vehicle 
{
    String model; // Variable declaration
    String Toyotaname;

    // Constructor with parameters
    public Toyota(String name, String model) { 
        // Calling superclass constructor
        super(model); 
        this.model = model;
    }

    // Method without parameters
    public void rev() { 
        System.out.println("Ratatata!");
    }

    // Method with parameter
    public void accelerate(int speed) { 
        
        System.out.println(Toyotaname + " is accelerating to " + speed + " km/h.");
    }
}
class Task_2{
    public static void main(String[] args) 
    {
        // Object creation
        Toyota toyota = new Toyota("Supra Mark 4", "2018");
        
        // Accessing inherited variable
        System.out.println("Name: " + toyota.name);
        
        // Accessing variable of child class
        System.out.println("Model: " + toyota.model);
        
        // Accessing inherited method
        toyota.drive();
        
        // Accessing method of child class
        toyota.rev();
        
        // Accessing method with parameter
        toyota.accelerate(250);
    }
}