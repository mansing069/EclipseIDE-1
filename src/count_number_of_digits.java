//java 6 =count_number_of_digits in number

public class count_number_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int count=0;
		while (num>0)
		{
			num=num/10;			//eliminate last digit
			count++;
		}
		System.out.println("number of digits:"+count);
	}

}
