public class StringDemo
{
    public static void main(String[] args) 
    {
        String s1= "java"; //immutable string and memory will be allocated in SCP
        System.out.println(s1);
        String s2= "java";
        System.out.println(s1 == s2); //true

        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1 == str2); //false as two different objects are created and points to two different refernces

    }
    
}

/*sequence of characters enclosed within double quotes is called String
 * String is a class in java and starts with uppercase S as String
 * Since String is a class in java, anything stored as string is called string object
 * In java string data is divided into two types 
 *   Immutable string -cannot be changed-   String
 *   Mutable string - changeable string -   StringBuffer and StringBuilder
 * 
 * Immutable String :
 *      To create immutable string object we use String class
 *      we can create immutable strings as follows
 *      1.String str = "java";
 *      2. String str = new String("Java");
 *      3. char ar[] = {'j','a','v','a'};
 *          String str = new String [ar];
 *  ==   -> Reference variables will be compared
 *  equals()  ->  String data will be compared
 *  equalsIgnoreCase()  -> String data will be compared ignoring the case
 *  compareTo()  -> String data will be compared char by char
 * 
 * on heap area ,we have string constant pool(SCP) to store string data
 * speciality of SCP is  : duplicates are not allowed unlike heap area
 * memory will be created in SCP when we use direct literal like  string s1 = "java";
 * 
 * Garbage collector cannot collect from SCP for those objects created without reference variable like by using new keyword
 * Memory of SCP deallocates once jvm is shutdown
 * 
*/