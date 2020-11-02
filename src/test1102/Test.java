package test1102;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is=System.in;
		Reader reader=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(reader);
		
		while(true) {
			System.out.println("입력하세요 :");
			String line=br.readLine();
			if(line.equals("q")||line.equals("quit")) {
				break;
			}
			System.out.print("입력된 내용: "+line);
			System.out.println();
			br.close();
			
		}
	}

}
