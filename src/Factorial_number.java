// JAVA-13 FIND FACTORIAL NUMBER
public class Factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		long Factorial=1;
		
	//Logic-1 (using for loop)
		for(int i=1 ; i<=num; i++)
		{
			Factorial=Factorial*i;
		}
		System.out.println("Factorial number is:" +Factorial);
		

	/*//Logic-2 (Desending order)
	//	int num=5;
		for (int i= num; i>1; i--)
		{
			Factorial=Factorial*i ;
		}
		System.out.println("Facotial of number is:" +Factorial);
	*/
	}

}
