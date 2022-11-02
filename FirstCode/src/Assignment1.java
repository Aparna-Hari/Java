
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 0; i<= n;i++)
		{
			//I
			for (int j =0; j<= n; j++) 
			{
				if ( i == 0|| j == n/2 || i == n)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("   ");
			
			//N
			for (int j = 0;j<= n;j++)
			{
				if(j==0||i==j || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			//E
			for(int j =0;j<=n;j++)
			{
				if(j==0||i==0&&j<=n/2 ||i==n/2&&j<=n/2 || i==n&&j<=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//U
			for(int j =0;j<=n;j++)
			{
				if(j==0 || i ==n || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			//R
			for(int j =0;j<=n;j++)
			{
				if(j==0 || i==0 || (j ==n && i <=n/2 )|| i==n/2 || (i>=n/2 && i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			//O 
			for(int j =0;j<=n;j++)
			{
				if((i==0&&j!=3*n/4&&j!=0&&j<3*n/4)||(j==3*n/4&&i!=0&&i!=n)||(i==n&&j<3*n/4&&j!=0)||(j==0&&i!=0&&i!=n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			//N 
			for(int j =0;j<=n;j++)
			{
				if(j==0||i==j || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			System.out.println(" ");
		}
		
	}

}
