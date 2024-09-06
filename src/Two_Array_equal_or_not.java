import java.util.Arrays;

 //java-16- To check two Array are equal or not
public class Two_Array_equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
	
//logic-1 using Arrays equal method
		boolean status=Arrays.equals(a1,a2);
		if (status==true)
		{
			System.out.println("Array are Equals");
		}
		else
		{
			System.out.println("Array are not Equals");
		}
		
/*	
//logic-2 using Forloop
		boolean status= true;
		if(a1.length==a2.length)
		{
		for (int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				status= false;
			}
			}
		}
		else
		{
			status= false;
		}
		if(status== true)
		{
		System.out.println("Array are Equal");	
		}
		else
		{
			System.out.println("Array are not Equal ");
		}
		}		
*/
	}
}
