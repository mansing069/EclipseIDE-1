//JAVA-8--->Sum of digit in a Number-

 	//number =1234
	//		=1+2+3+4
	//		=10
public class sum_of_digitnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int sum=0;
		while (num>0)			//1234  123  12  1
		{
		sum= sum+num%10;		//4+3+2+1  select only last digit
		num=num/10; 			//123  12  1  0   divided the digit
		}
		System.out.println("sum of digits in a number:" +sum );
		
	}
}
