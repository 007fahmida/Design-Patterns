interface VehicleA
{
    void setPrice(double price);
}

interface Movable
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements VehicleA, Movable
{
    double price;

    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Price:" +price);
    }

    public void start()
    {
        System.out.println("Start");
    }

    public void stop() 
    {
        System.out.println("Stop");
    }
}

class Aeroplane implements VehicleA, Movable, Flyable
{
    double price;

    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Price:" +price);
    }

    public void start()
    {
        System.out.println("Start");
    }

    public void fly()
    {
        System.out.println("Fly");
    }

    public void stop() 
    {
        System.out.println("Stop");
    }
}

class VehicleBuilder
{
    public static Car buildCar()
    {
        Car car = new Car();
        car.setPrice(15.00);
        car.start();
        return car;
    }
    public static Aeroplane buildAeroplace()
    {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setPrice(25.00);
        aeroplane.start();
        aeroplane.fly();
        return aeroplane;
    }
}

class InterfaceSegment
{
    public static void main(String[] args) 
    {
        Car car = VehicleBuilder.buildCar();
        car.stop();

        Aeroplane aeroplane = VehicleBuilder.buildAeroplace();
        aeroplane.stop();
    }
}