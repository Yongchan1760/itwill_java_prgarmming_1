package java1016;

public class Refer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =new String("abc");
		String b="abc";
		
		if(a==b) {
			System.out.println("참"); //주소번지로 비교
		}
		else {
			System.out.println("거짓");
		}
		
		if(a.equals(b)) {
			System.out.println("참");
		}
		else {
			System.out.println();//실제값만을 비교 
		}
	}

}
