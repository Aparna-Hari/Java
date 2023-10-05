import java.util.Scanner;

public class Array
{
	public static void main(String[] args) 
	{
		int[] ar = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the marks of student " + i);
			ar[i]= scan.nextInt();
		}
		System.out.println("Marks of students stored in array are:" );
        for (int i=0;i<5;i++)
        {
            System.out.print(ar[i] + " " );
        }
        scan.close();
	}

}

