package test1027;

import java.io.FileWriter;
import java.io.Writer;

public class Writer_Exam_2 {

	public static void main(String[] args) throws Exception{
		Writer writer=new FileWriter("C:/Temp/test8.txt");
		
		
		
		char[] array= {'D','E','F'};
		writer.write(array);
		
		
		
		writer.flush();
		writer.close();

	}

}
