//constructor-2 add to constructor_1
public class constructor_2 {

	int sid;
	String Sname;
	char grade;
	
	constructor_2(int id, String name, char g)
	{
		sid=id;
		Sname= name;
		char grade= g ;
	}
	void display() {
		System.out.println(sid+" "+Sname+" "+ grade);
	}
	
	}
