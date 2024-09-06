import java.util.HashSet;

//JAVA-19-Duplicate_element_in_Array

public class Duplicate_element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[]= {"java","c","c++","python","java"};
		
	//logic-1-Using forloop
	boolean Flag= false;
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i].equals(arr[j])) {
		
			System.out.println("found Duplicate Element:"+arr[i]);
			Flag=true;
			}
		}
	}
	if (!Flag) {
			System.out.println("Duplicate Element Not Found");
		}
	
		
/*		
	// logic 2-Using HashSet
	HashSet<String>langs= new HashSet();
	boolean flag =false;
	for (String l:arr) {
		if (langs.add(l)==false);
		{
			System.out.println("Found Duplicate Element :"+l);
			flag=true;
		}
	}
	if(flag==false)
	{
	System.out.println("Not found Duplicate");	
	}
*/
	
	}
}
			



