public class StringConcatenation 
{
    public static void main(String[] args) 
    {
        String str1 = "Java"; //Reference in SCP as it is created using direct literal
        String str2 = "Ja";
        String str3 = "va";

        String str4 = str2 +str3;

        System.out.println(str1 == str4); //false since str4 will be created in heap by concatenating two references
        
        String str5 = "Hyder";
        String str6 = "Hy"+ "der" ;
        System.out.println(str5 == str6); //true since str6 is created by concatenating direct literals and will be SCP
        

        String str7 = str2.concat(str3);
        System.out.println(str1 == str7); //false since we are concatenating using built in method

        String str8 = str1 + str5 + 100 + 99; //we can concat multiple strings using + unlike with concat().
        System.out.println(str8);//JavaHyder10099

        String str9 = null;
        //String str10 = str5.concat(str9); //cannot concat with null value using concat(), it Throws nullpointer Exception
        
        String str10 = str5+ str9;
        //Can concat null value using + operator
        System.out.println(str10); //Hydernull

        //String str11 = str1.concat(100);
        //Cannot concat string with int using concat()

        String str11 = str1 + "Hyder" + 99 + 100;
        System.out.println(str11); //JavaHyder99100

        String str12 = 100 + 99 + str1 + "Hyder";
        System.out.println(str12); //199JavaHyder - Addition if int is done first and concatenated to string


    }
}

/* we can concate two string using concat() and + 
 * 
 * 1.whenever there is string object, one copy has to be on SCP
 * 2.whenever we create a reference variable for string object, 
 *  reference variables will refer to string object in SCP only if its created using direct literal
 * 3. In rest of all the cases,reference variable will refer to object of heap area.
 *      i.e 
 * Memory will be in heap area when we create string object using 'new' or concatenating using reference variables
 *  or using inbuilt methods like concat.
 */


