 //swaping two numbers

//type-1-Swap of Two Numbers using third Variable
	public class swaping_two_numbers{
	public static void main(String[] args) {
		int a=10;
		int b=20;
	System.out.println("Before Swapping value are:" +a+" ,"+b);
		int t=a;
		a=b;
		b=t;
	System.out.println("After swapping value are :"+a+", "+b);
	}
	}
	
//Type2-Swapping of Two Numbers without using third Variable 
/*
	public class swaping_two_numbers {
 public static void main(String[] args) {
		int a = 20;	
		int b = 30;
		System.out.println("Before Swap Value are:" +a+ "" +b);
	
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swap Value are:" +a+","+b);
	}
}
*/

//Type3- using Multipal& devide without using third variable	
/*		public class swaping_two_numbers {
			public static void main(String[] args) {
					int a = 40;	
					int b = 50;
			System.out.println("Before Swap Value are :"+a+","+b);
					
					a = a * b;
					b = a / b;
					a = a / b;
			System.out.println("After Swap Value are:" +a+","+b);
			}
		}	
			
*/
/*
//Type4-Using Single Statement
 		public class swaping_two_numbers {
				public static void main(String[] args) {
					int a = 60;	
					int b = 70;
					System.out.println("Before Swap Value are :"+a+","+b);
					
					b=a+b-(a=b);
					System.out.println("After Swap Value are:" +a+","+b);
				}
			}		
					
*/