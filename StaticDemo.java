class Demo
{
    static int a; //1.static variables and static block are loaded during classloading subsystem by JVM
    static int b;  
    int x;
    int y;

    static //2.
    {
        a=100;
        b=200;
        System.out.println("This is static block");
    }

    //3.
    {
        x = 300;
        y = 400;
        System.out.println("This is java initialisation block");
    }
    //4.
    public Demo() //Java initialization method is first called when constructor is called during object creation as below
    {
        // {
        // x = 300;
        // y = 400;
        // System.out.println("This is java initialisation block");
        // }
        System.out.println("This is constructor");

    }

    static void disp1() //methods are invoked in the order we call them at main method
    {
        System.out.println("This is static method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2()
    {
        System.out.println(" This is non static method");
        System.out.println(x);
        System.out.println(y);
    }

}



public class StaticDemo 
{
    public static void main(String[] args) 
    {
        Demo d= new Demo();
        Demo.disp1(); //static method is called using classname
        d.disp2();
        System.out.println("This is from Main method");
    }
    
}
