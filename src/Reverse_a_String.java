//Reverse_a_String
import java.io.IOException;

public class Reverse_a_String {

	public static void main(String[] args)throws IOException  {
	

		// TODO Auto-generated method stub
		String str= "MANSING KHADE";
		String rev =" ";
/*
// Logic-1  using "+" string Concatation operator/ Method		
		int len =str.length();
		for (int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			//CharAt()-Extract character from String Using CharAt()index method
		}
		
		System.out.println("Reverse String is:"+rev);
	}
}
*/
/*
//L0ogic2- Using charactor Array
		//Logic2- Using charactor Array
		char a[]= str.toCharArray();
		//Convert String to Array,
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is:"+rev);
	}
	}
	
*/
	
		//Logic3-using String Buffer class
		 StringBuffer sb= new StringBuffer(str);
		 System.out.println(sb.reverse());
	
	}	
}


