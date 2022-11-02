import java.util.Scanner;
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {70,50,60,40,30,10,20,80};
		boolean flag = false;
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the key you want to search");
		int key = scan.nextInt();

		
		for ( int i = 0;i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.println("Number found at index" +i);
				flag = true;
				break;
			}
			
		}
		
		if ( flag == false)
		{
			System.out.println("Number not found");
		}
		
	}

}

