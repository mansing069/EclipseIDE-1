//count the even and odd digit in a given numbers

public class count_even_odd_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int even_count=0;
		int odd_count=0;
		while (num>0) 			//1234  123  12  1
		{
			int rem=num%10;  		//take last digit only
			if(rem%2==0)
			{
				even_count++;
			}
			else	
			{
				odd_count++;    		// 1    2    3
			}
			num=num/10;				//Eliminate last digit only  123   12  1   
		}
	
			System.out.println("number of even count:"+even_count);
			System.out.println("number of odd count:"+odd_count);
	}	
}

