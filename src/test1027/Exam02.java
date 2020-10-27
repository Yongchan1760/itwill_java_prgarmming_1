package test1027;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Exam02 {

	public static void main(String[] args) throws Exception{
		OutputStream os=new FileOutputStream("C:Temp/test4.db");
		/* byte[] array= "102030".getBytes(); */
		
		os.write("102030".getBytes());
		
		
		os.flush();
		os.close();
	}

}
