//separate the even and odd digit in a given Range
public class count_the_even_and_odd_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String even= "";
		String odd= "";
		//String even1;
		
		for(int i=20; i<40; i++) 
		{

			if(i%2==0) {
				even= even +","+ i ; //gap between two value(,)
			}
			else 
			{
				odd=odd +" "+ i;  //gap between two value( space )
			}
			 
		}
			System.out.println("Even Numbers are:" + even);
			System.out.println("Odd Numbers are:" + odd);
    	}
	}
