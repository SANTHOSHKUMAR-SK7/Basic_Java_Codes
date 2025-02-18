class Vehicle
{

    void startEngine()
    {
        System.out.println("START KARO BHAII");
    }
}
class Car extends Vehicle
{
    @Override
    void startEngine() {
        System.out.println("Car Engine Starts bhaiii");
    }

    void drive()
    {
        System.out.println("Car odudhu bhaii");
    }
}
class Truck extends Vehicle
{

    @Override
    void startEngine() {
        System.out.println("Now Truck Odudhuu bhaiii!");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Truck t = new Truck();
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.startEngine();
        c.startEngine();
        c.drive();
        t.startEngine();
    }
}