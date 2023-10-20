public class StringMethods 
{
    public static void main(String[] args) 
    {
        String s1 = "SACHIN";
        String s2 = "SACHIN TENDULKAR";
        String s3 = "ViratKohli";

        int res = s1.compareTo(s2);
        System.out.println(res);//-10
        System.out.println(s1.length()); //6 -length() is used to calculate length of the string

        System.out.println(s1.toLowerCase()); //sachin
        String s4 = (s3.toUpperCase()); //VIRATKOHLI
        String s5 = "VIRATKOHLI";

        System.out.println(s4==s5);//false

        System.out.println(s4);


        System.out.println(s3.substring(5));//Kohli
        System.out.println(s3.substring(5,6)); //K

        System.out.println(s2.charAt(7)); //T

        System.out.println(s5.endsWith("I"));//True;

        System.out.println(s4.indexOf("I")); //I

        System.out.println(s4.lastIndexOf("I"));//9

        String ar[]= s3.split("i");

        for(String elem : ar)
        {
            System.out.println(elem); //V ratkohl
        }
        
        char chArr[] = s3.toCharArray();
        for(char elem : chArr)
        {
            System.out.println(elem); 
        }
        // V
        // i
        // r
        // a
        // t
        // K
        // o
        // h
        // l
        // i

        String str1 = new String("Java");//Created in heap area
        String str2 = str1.intern(); //points to "Java" created in SCP during creation of str1 in heap 

        String str3 = "Java"; //Created in SCp as it is Direct literal

        System.out.println(str2 ==str3);//true

    }
}


/*
compareTo() is used to compare two strings,
however return type is int 
It returns 0 or +ve or -Ve values  
Whereas other methods like equalsIgnoreCase returns boolean value*/