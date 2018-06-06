package recursives;

import java.io.File;

public class printFileFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new printFileFolder()).recursive( new File("C:\\Jiang_quest\\data\\versions"), "");
	}

	public void recursive(File folder, String indent) {
	    File []files = folder.listFiles();
	    
		for (File file: files) {
		   
		   if (file.isDirectory()) {
			   System.out.println(indent+file.getName()); // create a file
		       recursive(file, indent+"   ");
			} else {
				System.out.println(indent+file.getName()); // create a file
			}
		}
	}
			
}
