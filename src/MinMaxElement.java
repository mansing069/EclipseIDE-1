// to find MIN and MAX number
public class MinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,3,9,5,9,6,4};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i]<min) {
					min= arr[i];
			}
			if(arr[i] > max) {
					max =arr[i];
			}
		}
		System.out.println("Minimum element:"+ min);
		System.out.println("Maximun element:"+ max);
	
	}
}
