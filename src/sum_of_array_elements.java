//java-14 sum of Elements in Array

public class sum_of_array_elements {               //main class

	public static void main(String[] args) {		//main method
		// TODO Auto-generated method stub
		int a[]= {5,2,8,9,7,6,2,4,5};
		int sum=0;
		for (int i=0; i<=a.length-1 ; i++)
		{
			sum=sum+ a[i];							//5+2+8+9+7+6+2+4+5
		}
		System.out.println("sum of Array elements:" +sum);
/*	

//logic-2 using Enhance for loop
		// normally there is no need to use
		// Intionalization ,condition,incrementation
		
		for (int value:a)
		{
			sum=sum +value;
		}
		System.out.println("Sum of Array elements:"+sum);	
*/			
		
	}

}
