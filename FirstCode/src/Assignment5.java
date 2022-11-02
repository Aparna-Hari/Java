

public class Assignment5{

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0 ; i< n; i++)
		{
			for (int j = 0 ; j< n; j++)
			{
				if( i==0  )
				
				
				System.out.print( "*");
				
			}

			
		
			for (int j = 0 ; j< n; j++)
			{
				if( i < j )
				
				
				System.out.print( "*");
				
			}
			
			
			System.out.println( "*");
			
		}
		
		
		for (int i = 1 ; i< n; i++)
		{
			for (int j = 0 ; j< n; j++)
			{
				if(i > j)
				
				
				System.out.print( "*");
				
			}
			System.out.println( "*");
		}
		

	}

}
