//java file 2- Reverse_a_number
	import java.util.Scanner;

	public class Reverse_a_number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=sc.nextInt();			// Num=1234
	
//(logic-1 Using Algorithum method)
		int rev=0;
		while (num!=0)
		{
			rev=rev*10 + num%10;
					// CASE1= 0*10 +1234%10 =4
					// CASE2= 4*10 +3 =43
					// CASE3= 43*10 +2 =432
					// CASE4= 432*10 +1 =4321
			num=num/10;
					// CASE1=1234/10=123(Eliminate last digit)
					// CASE2= 123/10=12
					// CASE3= 1/10=12
					// CASE4= 1/10=1
			}	
  System.out.println("reverse number is:"  +rev);
	}
	}
	
/*
	
 //(logic-2 Using String Buffer method)	
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	  	// (This step ,convert num into String format, & assign to 'sb'variable.) 
	StringBuffer rev=sb.reverse();
	  	//(Return type is 'String buffer')
	System.out.println("Reverse number is:" +rev);
	}
	}
*/
/*
// (login-3 Using String Builder class)	
	StringBuilder sbi=new StringBuilder();
	sbi.append(num);   //(append used for joint two values)
	StringBuilder rev =sbi.reverse();
			// (Using Reverse Method)
	System.out.println("Reverse number is " +rev);
	}
	}
*/