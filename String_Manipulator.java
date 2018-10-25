import java.util.Scanner;

/**
 * 
 * @author Jugat Singh
 * Java Period 5 odd
 *
 */
public class String_Manipulator 
{

	public static void main(String[] args) 
	{
		Scanner user= new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str= user.nextLine();
		
		int strLength = str.length();
		
		char firstLetter= str.charAt(0);
		char lastLetter = str.charAt(strLength-1);
		
		System.out.println("First Letter: "+ firstLetter);
		System.out.println("Last Letter: "+ lastLetter);
		
		System.out.println(str.substring(0, strLength/2));
		
		System.out.println("What character would you like to find: ");
		String character= user.nextLine();
		
		System.out.println(str.indexOf(character));
		
		System.out.println("Please enter the start index of the substring: ");
		String start= user.nextLine();
		System.out.println("Please enter the stop index of the substring: ");
		String stop= user.nextLine();

		int start_i= Integer.parseInt(start) ;
		int stop_i= Integer.parseInt(stop) ;
		
		System.out.println(str.substring(start_i, stop_i));
	}

}
