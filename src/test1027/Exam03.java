package test1027;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Exam03 {

	public static void main(String[] args) throws Exception{
		OutputStream os=new FileOutputStream("C:Temp/test5.db");
		/* byte[] array= "102030".getBytes(); */
		byte[] array= {10,20,30,40,50};
		
		os.write(array,1,3);
		
		
		os.flush();
		os.close();
	}

}
