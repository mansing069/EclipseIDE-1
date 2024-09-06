import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

//To find current date is greater / lesser

public class Localdate {

	String inputDate =" ";
	public void dateFormat()throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter date(yyyy-mm-dd): ");
		inputDate =sc.next();
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		LocalDate currentDate = LocalDate.now();  //passing today's date
		Date date1 = dateFormat.parse(currentDate.toString());
		Date date2 = dateFormat.parse(inputDate);
		
		
		if(date1.compareTo(date2)>0) {
			System.out.println("Current Date is Greater");
		}
		else{
			System.out.println("user Date is Greater");
		}
	}
	
	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
		Localdate day =new Localdate();
		try {
			day.dateFormat();
		}catch (ParseException e) {
			System.out.println("Please enter correct date format due to format to proceed");
			day.dateFormat();
		}
	}

}

