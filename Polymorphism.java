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

// Inherited methods: Such methods which are inherited from Parent to Child and used as its in Child class without any chnage in behaviour.

// Overridden methods:  Such methods which are inherited from Parent to Child and Modified in child class to suite child class requirement.

// Specialized method: Such methods which are there only in Child class not in the parent class.

// ---------------------------------------------------------------------------------------------------------

// Rules to be followed to override a method in Child/sub class:

//  we cannot reduce visibility of the overridden methods.

//  we can increase the visibility of the overridden methods.

//  we cannot change the return type for overridden methods.

//  we can change the return type for overridden methods However to make this,  the return type must be  Co-Varient return type.
// (Is-A relationship must exists between return types).

//  We cannot change parameter list of overriden methods in child class. If we do so it will be conisdered as specilized method of Child class by following Concepts of Method overloading.

// --------------------------------------------------------------------------------------------------------------------------
// Polymorphism or Runtime Polymorphism can be achieved a) By Creating Parent type refrence for Child type Object
//                              B) By method overridding (To show diff behaviour at the run time)

// -----------------------------------------------------------------------------------------------------------------
// Abstraction --> abstarct keyword ----> Hiding implementation ===> Providing requirement to be implemented


// Abstarction --> a) abstract class b)interface

// ---> Abstract class is such a class which will have an Abstract method.

// ---> Abstract methods are such methods which will have only method signature no body/implementation.

// ---> Abstract class can have all methods abstract.

// --> Abstract class can have both abstract and concrete methods.

// ==> Abstract class reference variable can be created so that we can achieve polymorphism.

// --> Abstract class cannot be Instantiated. (Object cannot be created)

// --> It's responsibility of Child class to give implementation for an ABstract class. However if a class extends an Abstract class and does't give implementation for abstract methods on that class then that child class must also declared abstract.

// --> A class can be abstract, method can be abstract but we cannot make a variable abstract.
