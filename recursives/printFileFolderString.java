package recursives;

import java.io.File;

public class printFileFolderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new printFileFolderString()).recursive("C:\\Jiang_quest\\data\\versions", "", "");
	}

	void New_OneDriveFolder(String curFolder, String indent) {
		System.out.println(curFolder+indent); // create a file
	}
	
	void Upload_OneDriveItem(String curFolder, String fileName, String indent) {
		String path = "";
		if (curFolder.equals("")) {
			path = fileName;
		} else {
			path = curFolder + "\\" + fileName;
		}
		System.out.println(indent+path); // create a file
	}
	
	public void recursive(String basePath, String curFolder, String indent) {
		File item = new File(basePath+"\\"+curFolder);
	    File []files = item.listFiles();
	    
		for (File file: files) {
			if (file.isDirectory()) {
				String newPath = curFolder.equals("") ? file.getName() : curFolder + "\\" + file.getName();
				indent += "  ";
			   	New_OneDriveFolder(newPath, indent); // create a folder
		       	recursive(basePath, newPath, indent);
			} else {
				Upload_OneDriveItem(curFolder, file.getName(), indent);
			}
		}
	}
			
}
