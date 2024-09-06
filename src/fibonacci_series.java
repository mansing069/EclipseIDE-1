//java10 =fibonacci Series
//fibonacci Series-->a series of numbers in which each number is sum of two preceding(previous) numbers.
// Eg= 0 1 1 2 3 5 8 13 21 34



public class fibonacci_series {   					//class name

	public static void main(String[] args) {		//main mathod
		// TODO Auto-generated method stub
		int n1=0, n2=1, sum=0;						//variable
	
		for (int i=2; i<10; i++) {					//conditions up to 10 value.
			sum=n1+n2;
			System.out.println("fibonacci_series: "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
