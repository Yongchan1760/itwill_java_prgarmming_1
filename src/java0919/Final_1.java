package java0919;

public class Final_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final a=new Final("010-3030-5301","Àç¾ÓÀÌ");
		System.out.println(a.ssn);
		System.out.println(a.name);
		//a.nation="11";
		a.name="Àç¾Ó";
		System.out.println(a.name);
		Final.num=20;
		System.out.println(Final.num);
	}

}
