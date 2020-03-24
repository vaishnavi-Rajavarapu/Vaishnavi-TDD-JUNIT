package TddJunit;
import java.util.*;
public class stringoperation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String string_given =sc.nextLine();
		int length=string_given.length();
		if(string_given.charAt(0)=='A') {
			string_given=string_given.substring(1, length);
			length=length-1;
		}
		if(string_given.charAt(0)=='A') {
			string_given=string_given.substring(1, length);
			length=length-1;
		}
		System.out.println(string_given);
	}
}