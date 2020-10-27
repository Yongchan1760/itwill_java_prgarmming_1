package test1027;

import java.io.InputStream;
import java.net.URL;

public class UrlEx {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.google.com/index.html");
			InputStream is=url.openStream();
			byte[] buffer =new byte[100];
			while(true) {
				int cnt =is.read(buffer);
				if(cnt==-1) {
					break;
				}
				System.out.println(new String(buffer));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
