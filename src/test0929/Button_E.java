package test0929;

public class Button_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Button();
		btn.setOnClickListener(new Call());
		btn.touch();
		
		btn.setOnClickListener(new Message());
		btn.touch();
	}

}
