package java1016;

public class Refer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 ="   02";
		String tel2 ="123    ";
		String tel3 ="		abc			";
		
		String sum=tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(sum);
		String sum2=tel1.trim()+tel1.trim();
		System.out.println(sum2);
		
	}

}
