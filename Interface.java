interface Calculator1
{
    void add(); //public abstract void add();
    void sub(); //public abstract void sub();
    void disp();
} 

interface Calculator2
{
    void mul(); //public abstract void mul();
    void div(); //public abstract void div();
}

interface Many
{
    float pi = 3.14f; //public static final float pi = 3.14f;
}

interface Alpha //** interface without any method is called marker/tagged interface,jvm takes care of it */
{

}
interface Beta //** from java8 interface can have method with implementation */
{
    default void disp()
    {
        System.out.println("Implemented method of an interface");
    }
}

class AplhaBeta implements Beta 
{
    void show()
    {

    }
    public void disp() //Implemented methods are inherited by implementing classes
    {
        System.out.println("Implemented method of an interface overriden by choice,not mandatory");
    }
}

class MyCalculator1 implements Calculator1,Calculator2,Many //**one class can implement more than one interface at a time
{
    public void add()
    {
        int result = 10 + 4;
        System.out.println("Implemented by Dev1 " +result);
        System.out.println(pi); 
        //** Variables of interface gets inherited in all the implementing classes 
        //however those variables are by default public,static and final
    }

    public void sub()
    {
        int result = 10 - 4;
        System.out.println("Implemented by Dev1 :" +result);
    }

    @Override
    public void mul() 
    {
        int result = 10 * 4;
        System.out.println("Implemented by Dev1 " +result);
    }

    @Override
    public void div() 
    {
        int result = 10 / 4;
        System.out.println("Implemented by Dev1 " +result);
    }

    @Override
    public void disp() {
        System.out.println("Implemented");
    }

}

class MyCalculator2 implements Calculator1
{
    public void add()
    {
        int a=20;
        int b=6;
        int result = a+b;
        System.out.println("Implemented by Dev2 : " +result);

    }
    public void sub()
    {
        int a=30;
        int b=6;
        int result = a-b;
        System.out.println("Implemented by Dev2 :" + result);

    }
    @Override
    public void disp() {
        
    }
}

abstract class MyCalculator3 implements Calculator1 //**since we have implemented only one method , class must be marked as abstract
{
    public void add()
    {
        float  a=20.2f;
        float  b=6.2f;
        float result= a+b;
        System.out.println("Implemented by Dev2 : " +result);
    }
} 

class Beta2  // *** if Class is containing only one method and we invoke  that only once in project
//Then we dont create an object for that method and instead create a reference to call that method
//Such object is called anonymous object
{
    void behave()
    {
        System.out.println("Best behaviour ...");
    }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        MyCalculator1 c1 = new MyCalculator1();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();

        MyCalculator2 c2 = new MyCalculator2();
        c2.add();
        c2.sub();

        new Beta2().behave(); //anonymous object
    }
    
}


// We can specify the application/Program requirement using interface.

// we can create an interface using 'interface' keyword.

// Inside an interface all the methods are by default/nature  public and abstract

// void add() ---> public abstract void add();

// interface is a collection of public abstract methods.

// An interface can have any number of implementing classes (Implementations) 

// We can create reference of interface type.

// We cannot create Object of an interface.(interface cannot be instantiated)

// interface can be implemented by classes using 'implements' keyword.

// An interface can have any number of implementations(one interface can have any number of classes implementing it)

// A class can implement multiple interfaces.(refer code source).

// An interface cannot implement another interface.

// An interface can extend another interface.

// A class can extend another class & also implements an interface at same time(extends first then implements).

// An interface can have a variable. However variable inside an interface is public static and final. None of the implementing classes can modify that data.

// Marker interface is such an interface for which developer need not to give implementation. (Better understanding in IO concept) example: Serializable interface


// From Java 8 an interface can have a method with body(implementation). 
//However that method must be declared using default keyword.
// It's not compulsory for an implementing class to override the default methods of an interface,
// however if needed we can override also.
// (here default is not a access specifier,  public is the access specifier )

// From Java 8 an interface can also have static methods. 
//However an implementing class cannot override that static method of an interface. 
//static methods of interface will not  get inherited by implementing classes ,however We can  invoke static method of an interface using interface name directly.