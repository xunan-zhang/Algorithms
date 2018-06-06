/**
 * 
 */
package zxa;

//check one string is a roation of another string
public class CheckStringRotation {
	
	public static void main(String []argv) {
		String s1 = "abcd";
		String s2 = "cdab";
		boolean ret = new CheckStringRotation().checkRoationOfStrings(s1, s2);
		
		System.out.println(ret);
	}
	
	boolean checkRoationOfStrings(String s1, String s2)
	{
		boolean ret = false;
		
		if (s1.length() == s2.length()) {
			String s3 = s1+s1;
			if (s3.indexOf(s2) >= 0)
				ret = true;
		}
		
		return ret;
	}

}
