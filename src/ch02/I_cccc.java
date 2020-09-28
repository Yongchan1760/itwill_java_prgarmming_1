package ch02;

class Cream1{
	int topping_p=40;
	int topping_c=30;
	public void banna(){
		System.out.println("바나나 소스 많이");
	}
	
}

class Source1 extends Cream1{
	public void banna(){
		System.out.println("바나나1111");
	}
}
class Source2 extends Cream1{
	public void banna(){
		System.out.println("바나나2222");
	}
}

public class I_cccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cream1 cream;
		
		
		cream= new Source1();
		cream.banna();
		
		
		cream=new Source2();
		cream.banna();
		
		
		
		
		
		
		
		
	}
}
