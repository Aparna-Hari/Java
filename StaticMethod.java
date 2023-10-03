class Parent
{
    static void disp() //static methods can participate in inheritance
    {
        System.out.println("Parent static disp");
    }
}

class Child extends Parent
{
        
    //whenever we try to override the static method in child class,it hides the parent class static method and behaves as 
    //a specialized method,i.e we cannot override the static method in child class.

    //@override
    static void disp()
        {
            System.out.println("Child static method");
        }
    


}



public class StaticMethod {
    public static void main(String[] args) 
    {
        System.out.println("Hi");
        Parent.disp();
        Child.disp();
    }
}
