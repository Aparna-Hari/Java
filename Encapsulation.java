//Binding of data and methods together is called encapsulation

class Student
{
    private int id;
    private String name;
    private int marks;   //data hiding
    
    public int getId()  //getter
    {
        return id;
    }
    public void setId(int id) //setter
    {
        this.id = id;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getMarks() 
    {
        return marks;
    }
    public void setMarks(int marks) 
    {
        this.marks = marks;
    }
    public void show()
    {
        System.out.println(id);
    }
}


public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.setId(10);
        System.out.println("Id of Student 1 is :" +s1.getId());  

        Student s2 = new Student();
        s2.setId(11);
        System.out.println(" Id of Student 2 is :" +s2.getId());

        Student s3 = new Student();
        s3.setId(12);
        System.out.println(" Id of Student 3 is :" +s3.getId());
    }
    
}
