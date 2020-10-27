package test1027;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx_2 {

	public static void main(String[] args) throws Exception{
		Reader reader=new FileReader("C:/Temp/test8.txt");
		
		char [] buffer=new char[100];
		while(true) {
			int read=reader.read(buffer);
			if(read==-1) {
				break;
			}
			for(char i:buffer) {//
				System.out.println(i);
				
			}
			for (int i = 0; i <read ; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();

	}

}
