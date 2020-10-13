package test1013;

public class TTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs1=new String[30];
		
		for (int i = 0; i < strs1.length; i++) {
			strs1[i]="abc";
				String[]strs2=new String[10];
				System.arraycopy(strs1, 0, strs2, 0, 10);
		}
	}

}
