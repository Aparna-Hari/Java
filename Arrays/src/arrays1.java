
public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D
		//int[] arr = {0,1,2,3,4};
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		for (int elem : arr)//enhanced loop to avoid out of bound exceptions
		{
			System.out.println(elem);
		}
		
		
		//MultiD
		int[][] arr1 = {{10,20},{30,40,50},{60,70,80,90}};
		
		for(int ar[] : arr1)
		{
			for(int a : ar)
			{
				System.out.println(a);
				System.out.println(arr1[0][0]);
			}
		} 
		
		
		
		//print alternative values of array
		for(int i = 0;i<arr.length; i++)
		{
			System.out.println(i);
			++i;
		}
	}

}
