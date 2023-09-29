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

class Area{
    float r;
    static float pi = 3.14f;//By making pi as static variable, we dont have to assign memory for pi in the heap everytime we create object
    float area;

    public float calcArea(float radius)
    {
        this.r = radius;
        area = pi* r*r;
        return area;
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

        Area a1= new Area();
        float area1= a1.calcArea(6); 
        System.out.println(area1);

        Area a2= new Area();
        float area2= a2.calcArea(8);
        System.out.println(area2);

        Area a3= new Area();
        float area3= a3.calcArea(9);
        System.out.println(area3);

        Area a4= new Area();
        float area4= a4.calcArea(10);
        System.out.println(area4);
    }
    
}
