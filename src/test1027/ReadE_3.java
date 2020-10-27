package test1027;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadE_3 {

	public static void main(String[] args) throws Exception{
		InputStream is=new FileInputStream("C:Temp/test4.db");
		
		byte[] buffer=new byte[5];
		
		int read=is.read(buffer,2,3);
		if(read!=-1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();

	}

}
