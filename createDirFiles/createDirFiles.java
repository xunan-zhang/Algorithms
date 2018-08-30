package createDirFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class createDirFiles
{
  void createFile(String dir, int i, int j)
  {
	  for (int k = 0; k<100; k++) {
		  String fileName = dir + "\\"+ "F" + i + j + String.format("%02d", k);
		  File f = new File(fileName);
		  try {
			f.createNewFile();
			PrintWriter out = new PrintWriter(fileName);
			out.println("test data to the file");
			out.close();
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
  
  
  void createDir(){
    for (int i=0; i<10; i++) {
  	  String dir = "h:\\quest\\";
      dir = dir+"D"+i;
      new File(dir).mkdirs();
      for (int j=0; j<10; j++) {
        String dirName = dir+"\\subD"+i+j;
        new File(dirName).mkdirs();
        createFile(dirName, i, j);
      }
    }
  }
  
  public static void main(String []argv){
	  long millis = System.currentTimeMillis();
	  new createDirFiles().createDir();
	  long millis2 = System.currentTimeMillis();
	  System.out.println((millis2 - millis)/1000);
  }
}

