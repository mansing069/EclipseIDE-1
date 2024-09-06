//java-15 print Even and Odd numbers in Array
public class print_even_numbers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};

//logic 1-Using normal FORLOOP		
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
/*		
//logic 2-Using Enhance forloop 		
		for(int value:a)
		{
		if(value%2==0)
		{
			System.out.println(value);
		}
		}
*/				
	}

}
