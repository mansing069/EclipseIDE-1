
public class print_odd_numbers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};

		
//logic 1-Using normal FORLOOP -odd numbers			
	for (int i=0; i<a.length;i++)
	{
		if (a[i]%2!=0)
		{
			System.out.println(a[i]);		//1  3  5
		}
	}
/*
//logic2-Using Enhance forloop 	
	for(int value:a)
	{
		if(value%2!=0)
	{
		System.out.println(value);
	}
	}
*/
	}

}
