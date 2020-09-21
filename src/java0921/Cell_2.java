package java0921;

public class Cell_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cell_1 a=new Cell_1("자바폰","검정",10);
		System.out.println("모델"+a.model);
		System.out.println("모델"+a.color);
		
		System.out.println("채널"+a.channel);
		
		a.poweron();
		a.bell();
		a.sendvoice("여보세요");
		a.receivevoice("안녕하세요! 홍길동이에요");
		a.sendvoice("반갑습니다.");
		a.hangup();
		
		a.turnondmb();
		a.changechannel(12);
		a.turnoffdmb();
	}

}
