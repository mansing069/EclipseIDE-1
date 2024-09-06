//java11--Check a number is Prime or Not.....
public class prime_number {

	public static void main(String[] args) {     //main method
		// TODO Auto-generated method stub
		int num=17;					//variable-1
		int count =0;				//variable-2

 if (num>1)						//using if condition-->value is greater than 1.
 {
	 for (int i=1; i<=num; i++) {   // use for loop -->value start 1 to 17.and sign ++
		 if (num%i==0) {			//if condition
		 count++; 
		 }
	 }
	 if(count==2) {					 		//if condition
		 System.out.println("He is a prime number");
	 }
	 else
	 {System.out.println("He is not prime number");
	 	 }
 	}
else {
	 System.out.println("not a prime number");
   }
 }
}