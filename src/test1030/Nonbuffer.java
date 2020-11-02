package test1030;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Nonbuffer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String originalFilePath1=
				Nonbuffer.class.getResource("originalFile1.jpg").getPath();
		String tagetfilepath1="C:/Temp/targetFile1.jpg";
		FileInputStream fis=new FileInputStream(originalFilePath1);
		FileOutputStream fos=new FileOutputStream(tagetfilepath1);
		
		String originalFilePath2=
				Nonbuffer.class.getResource("originalFile2.jpg").getPath();
		String tagetfilepath2="C:/Temp/targetFile1.jpg";
		FileInputStream fis2=new FileInputStream(originalFilePath2);
		FileOutputStream fos2=new FileOutputStream(tagetfilepath2);
		BufferedInputStream bis= new BufferedInputStream(fis2);
		BufferedOutputStream bos=new BufferedOutputStream(fos2);
		
		
		
	}

}
