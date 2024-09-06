// JAVA-18-Find maximum and minimum values in Array

	public class find_maximum_and_minimum_values {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Logic 1-Maximum value	
		int a[]= {50,100,40,20,60};
		int max =a[0];
		for(int i=1; i<a.length;i++)
	{
		if(a[i]>max)		
		{
			max= a[i];
		}
	}
	System.out.println("maximum Element in Array is:" +max);
	
/*
	//Logic 2-Minimum value
	int b[]= {50,100,40,20,60};
	int min=b[0];
	for (int j=1; j<b.length;j++)
	{
		if (b[j]<min)
		{
			min=b[j];
		}
	}
	System.out.println("minimum Element in array is:" +min);	
*/
	}
}
	
