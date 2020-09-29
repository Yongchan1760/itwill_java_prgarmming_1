package test0929;

public class Call implements Button.OnClickLinstner{
	@Override
	public void onClick() {
		System.out.println("전화를 켭니다");
	}
}
