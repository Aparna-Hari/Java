class Plane
{
    public void fly()
    {
        System.out.println("Plane flies");
    }

    public void takeOff()
    {
        System.out.println("Plane is taking off");
    }
}

class CargoPlane extends Plane //Inheritance
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

class PassengerPlane extends Plane
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

class Human
{
    public void sleep()
    {
        System.out.println("Human is sleeping");
    }
    public int eat()
    {
        System.out.println("Human needs to eat to survive");
        return 10;
    }

    public Plane travel()
    {
        System.out.println("Human uses plane to travel");
        Plane p = new Plane();
        return p;
    }

}

class Employee extends Human
{
    public void sleep()//overriden method
    {
        System.out.println("Employee needs sleep after office hours");
    }

    public int eat()
    {
        System.out.println("Employee needs food during office hours");
        return 1;
    }

    public PassengerPlane travel() //return types cannot be changed in overriden methods except when they are co-variants
    //like it should have Is-a relationship to be called as co-variant
    //primitive datatypes wont be qualified for overriding
    {
        System.out.println("Employee travels in passenger plane");
        PassengerPlane pp = new PassengerPlane();
        return pp;

    }

}

class Airport
{
    public void permit(Plane p)
    {
        System.out.println("-------------------------------");
        System.out.println("from Airport class");
        p.takeOff(); //1:many, runtime polymorphism
        p.fly();
    }
}




public class Polymorphism {
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.sleep();
        emp.eat();
        emp.travel();

        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();

        //type 1
        Plane plane;//reference variable of parent class(not object)

        System.out.println("using parent reference");
        System.out.println("-------------------------");
        plane = pp; //Plane plane = new PassengerPlane();
                    //Parent type reference is referring to the child type object            
        plane.takeOff();

        System.out.println("using parent reference");
        System.out.println("-------------------------");

        plane = cp;
        plane.takeOff();

        
        //type 2
        Airport a = new Airport();

        a.permit(pp);
        a.permit(cp);

        
    }
}
