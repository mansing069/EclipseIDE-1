//java-9 find largest of 3_numbers

import java.util.Scanner;

	public class largest_3_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter second Number");
		int b=sc.nextInt();
		System.out.println("Enter Thired Numbers");
		int c=sc.nextInt();
		
	//(logic-1)
		if(a>b && a>c)
		{
			System.out.println("largestNumber "+a);
		}
		else if (b>a && b>c) {
			
			System.out.println("largestNumber "+b);
		}
		else {
			System.out.println("largestNumber "+c);
			}
		}
 	}
	
	
/*		Logic2--> Ternary operator( ? )
	
		int largest1=a>b ? a:b; //largest of a&b
		int largest2=c>largest1? c:largest1;
		System.out.println(largest2 + "= " + "is largest number");
		
	}
			}
*/			
