import java.util.Scanner;

class Array1D
{
		int[] arr1 = new int[5];
		void disp()
		{
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the marks of student " +i);
				Scanner scan = new Scanner(System.in);
				arr1[i]= scan.nextInt();
				
			}
			
			System.out.println("Marks of students stored in array are:" );
			for(int i=0;i<5;i++)
			{
				System.out.print(arr1[i] + " " );
			}
			
            
		}
} 

class Array2D
{
	int[][] arr2 = new int[3][4];
	void studentPerClass()
	{
		for(int i= 0;i < arr2.length;i++)
		{
			System.out.println(arr2[0].length);
			System.out.println(arr2.length);

			System.out.println(" Marks of students in class" + i + " :");
			for (int j=0;j < arr2[i].length;j++)
			{
				System.out.println("Enter  Marks of student " + j + " :");
				Scanner scan = new Scanner(System.in);
				arr2[i][j] = scan.nextInt();
			
			}
		}	
			System.out.println("Marks of student stored in array are :");
			for(int i=0;i<3;i++)
			{
				for (int j=0;j<arr2[i].length;j++)
				{
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}


	}
}


class JaggedArray
{
	int[][] arr3 = new int[3][];
	{
	arr3[0] = new int[4];
	arr3[1] = new int[3];
	arr3[2] = new int[2];
	}
	void jaggedStudentPerClass()
	{
		System.out.println(arr3[0].length);
			System.out.println(arr3[1].length);
			System.out.println(arr3[2].length);
			System.out.println(arr3.length);
		for(int i= 0;i < arr3.length;i++)
		{
			

			System.out.println(" Marks of students in class" + i + " :");
			for (int j=0;j < arr3[i].length;j++)
			{
				System.out.println("Enter  Marks of student " + j + " :");
				Scanner scan = new Scanner(System.in);
				arr3[i][j] = scan.nextInt();
			
			}
		}	
			System.out.println("Marks of student stored in array are :");
			for(int i=0;i<3;i++)
			{
				for (int j=0;j<arr3[i].length;j++)
				{
					System.out.print(arr3[i][j] + " ");
				}
				System.out.println();
			}
	}
}


public class Array
{
	public static void main(String[] args) 
	{
		Array1D ar1 = new Array1D();
		ar1.disp(); 

		Array2D ar2 = new Array2D();
		ar2.studentPerClass();

		JaggedArray ar3 = new JaggedArray();
		ar3.jaggedStudentPerClass();

	}

}

