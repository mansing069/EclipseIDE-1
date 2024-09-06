//JAVA-17-Find missing number in a array
public class missing_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5};
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in Array:"+sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2= sum2+i;
		}
		System.out.println("sum of range of elements in array:"+sum2);
		
		System.out.println("missing number is:"+(sum2-sum1));
		
	}

}
