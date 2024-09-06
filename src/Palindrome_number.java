//java4 =Palindrome_number(is that number remains same when it is reverse.16161)
import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);  //TYPE-1
//		System.out.println("Enter a Number:"); //TYPE-1
//		int num =sc.nextInt();  //TYPE-1
			
		int num =16161;		//TYPE-2
		int org_num=num;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
	if (org_num== rev) {
		System.out.println("palindrome Number :" +rev );
	}else
	{
		System.out.println("Non a palindrome Number :" +rev);
	}
	}
}


