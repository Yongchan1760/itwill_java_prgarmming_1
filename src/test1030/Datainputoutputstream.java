package test1030;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Datainputoutputstream {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		  FileOutputStream fos=new FileOutputStream("C:/Temp/primitive.db");
		  DataOutputStream dos=new DataOutputStream(fos);
		 
		 dos.writeUTF("홍길동"); dos.writeDouble(98.5); dos.writeInt(1);
		  
		  dos.writeUTF("강감찬"); dos.writeDouble(98.5); dos.writeInt(1);
		  
		  dos.flush(); dos.close();
		  
		  FileInputStream fis=new FileInputStream("C:/Temp/1.db");
			DataInputStream dis=new DataInputStream(fis);
			
			for (int i = 0; i < 2; i++) {
				String name=dis.readUTF();
				double score=dis.readDouble();
				int order=dis.readInt();
				System.out.println(name+":"+score+" : "+order);
				
			}
			dis.close();	
		
	
	}
}
