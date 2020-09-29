package test0929;



public class Message implements Button.OnClickLinstner{
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
