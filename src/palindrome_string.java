//java5 =palindrome string-> A string that remains same when its character are reversed  (eg-MADAM-->MADAM)

import java.util.Scanner;
//java-5 -palindrome string
public class palindrome_string {

public static void main(String[] args) {
/*		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in); //TYPE-1
 		//create object of scanner class
 System.out.println("Enter a String:"); //TYPE-1
 String str=sc.next();		//TYPE-1		
 */
 String str="MADAM";			//TYPE-2

  String org_str=str;
  String rev ="";
  int len= str.length();
  for (int i=len-1; i>=0;i--) {
	 rev=rev+str.charAt(i);
	}
	if(org_str.equals(rev)){
	  System.out.println(org_str + ": is palindrome string");
  }
	else{
		System.out.println(org_str + ": is not palindrome string");
		
		}
	}
}
