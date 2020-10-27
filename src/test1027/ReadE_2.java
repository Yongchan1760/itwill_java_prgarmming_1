package test1027;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadE_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is =new FileInputStream("C:/Temp/Test2.db");
		byte[] buffer=new byte[100];
		
		while(true) {
			int readbytenum=is.read(buffer);
			if(readbytenum==-1) {
				break;
			}
			for(int i :buffer) {
				System.out.println(buffer[i]);
			}
			for (int i = 0; i < readbytenum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
