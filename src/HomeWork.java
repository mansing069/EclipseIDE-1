import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String arr[] = {"java", "c", "c++", "python", "java"};

	        // logic-1-Using for loop
	        boolean Flag = false;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i].equals(arr[j])) { // Use .equals() for string comparison
	                    System.out.println("Found Duplicate Element: " + arr[i]);
	                    Flag = true;
	                }
	            }
	        }
	        if (!Flag) { // Corrected to check if Flag is false
	            System.out.println("Duplicate Element Not Found");
	        }
	    }
	}

