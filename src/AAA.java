// Assending order with Doller
public class AAA {
	public static void main(String[]args){
        String str="MADAM";
        String org_str=str;
        String rev=" ";
        
        int len= str.length();
        for(int i=len-1 ;i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println("it is palindrom String :"+ org_str);
        }
        else{
            System.out.println("Not palindrom String :" + org_str);
        }
    }
	
	

}