//JAVA-22-Sort Element in Array sort(Bubble sort) 
import java.util.Arrays;

public class Babble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,3,4,2};
		System.out.println("Array Before Sorting:"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
		for(int j=0;j<n-1;j++)	
			if(a[j]>a[j+1])
		{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
		}
		}
	
		System.out.println("Array after sorting:"+Arrays.toString(a));
	}
 
}
