abstract class Plane //classes which doesn't have method  implementation are called abstract classes
{
    public final float pi = 3.147f; //variable cannot be abstarct but it can be final which then acts as a constant
    abstract public void fly();
    abstract public void takeOff();

    final public void landing() //concrete methods can also be present in abstract classes
    //final method can be inherited by its child class but  cannot  be overriden in child class 
    {
        System.out.println("plane is landing");
    }
    
}

class CargoPlane extends Plane //We can  implement abstract class methods through inheritance
{
    public void fly() 
    {
        System.out.println("Cargo plane carry goods");
    }
    public void takeOff()
    {
        System.out.println("Cargo plane is taking off");
    }
}

final class PassengerPlane extends Plane //final restricts a class from inheritance,i.e you cannot inherit PassengerPlane class
{
    public void fly() 
    {
        System.out.println("Passenger plane carry people");
    }

    public void takeOff()
    {
        System.out.println("Passenger plane is taking off");
    }
}


class Airport
{
    public void permit(Plane plane)//Abstract parent class reference variable can be created to achieve polymorphism
    {
        plane.takeOff();
        plane.fly();
        plane.landing();
    }
}


public class Abstraction 
{
    public static void main(String[] args) 
    {
        CargoPlane cp = new CargoPlane();
        Plane pp= new PassengerPlane();
        Airport a = new Airport();

        a.permit(cp);
        a.permit(pp);
        
        
    }
    
}
