package java0921;

public class Cell_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cell_1 a=new Cell_1("�ڹ���","����",10);
		System.out.println("��"+a.model);
		System.out.println("��"+a.color);
		
		System.out.println("ä��"+a.channel);
		
		a.poweron();
		a.bell();
		a.sendvoice("��������");
		a.receivevoice("�ȳ��ϼ���! ȫ�浿�̿���");
		a.sendvoice("�ݰ����ϴ�.");
		a.hangup();
		
		a.turnondmb();
		a.changechannel(12);
		a.turnoffdmb();
	}

}
