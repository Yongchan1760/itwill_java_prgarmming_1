package test1027;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlEx_2 {

	public static void main(String[] args) {
	
			try {
				OutputStream os=new FileOutputStream("C:/Temp/index.html");
				
				URL url=new URL("http://www.google.com/index.html");
				
				InputStream is=url.openStream();                                                                                                                     
				byte[] buffer =new byte[100];
				while(true) {
					int cnt =is.read(buffer);
					if(cnt==-1) {
						break;
					}
					/*
					 * String str=new String(buffer); os.write(str.getBytes());
					 */
					os.write(buffer);
				}
				is.close();
				os.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("ау╥А");
	}

}
