
public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArray[]= {1,2,3};
		int secondArray[]= {4,5,6};
		
		int firstArraySize=firstArray.length;
		int secondArraySize=secondArray.length;
		
		int mergeArraySize= firstArraySize +secondArraySize;
		
		int[]MergeTwoArray = new int[mergeArraySize];
		
		for(int i=0; i< firstArraySize; i++) {
			MergeTwoArray[i]= firstArray[i];
		}
		for(int i=0; i< secondArraySize; i++) {
			MergeTwoArray[firstArraySize + i]= secondArray[i];
		}
		for(int i=0; i<mergeArraySize;i++) {
			System.out.print(MergeTwoArray[i]);
		}
	}
}
