package ch02;

class Ice_77{
	public void ice(){
		System.out.println("�ұ�ġ��");
	}
}
class P1 extends Ice_77  { 
	
	@Override
	public void ice() {
		System.out.println("���ٱ� ���屹�� �鰳 ���� �ֱ�");
	}
	public void ���߰��ϱ�(){
		System.out.println("���߰�!");
	}
}
class P2 extends Ice_77{ 
	
	@Override
	public void ice() {
		System.out.println("�ᳪ�����屹�� ���߰��� �ֱ�");
	}
	public void �ᳪ���ֱ�(){
		System.out.println("�ᳪ��!");
	}
}

class Double_ice{
	//��ĳ������ �θ�Ŭ����Ÿ���� ���������� ���� �ڽİ�ü�� ������ 
	//�ϳ��� �޼ҵ常 ����� �Ű������� Ÿ���� ��ĳ������ �������� �޴´�.(��ȿ�����̴�)
	public void tiger(Ice_77 a){ //new ���ٱ����屹();  new �ᳪ�����屹();
		a.ice();
	}
	//�Ű������� ���� ���� ��ü�� �װ�ü�� Ŭ����Ÿ���� ���������θ� ��ü�� ���� ������ �ִ�.
	public void cat(P1 aa){
		aa.ice();
	}
	//�Ű������� ���� ���� ��ü�� �װ�ü�� Ŭ����Ÿ���� ���������θ� ��ü�� ���� ������ �ִ�.	
	public void dog(P2 bb){
		bb.ice();
	}
}
public class Test_11111 {

	public static void main(String[] args) {		
		//�밴 ��ü ����  -> �������� �밴1
		Double_ice double_ice = new Double_ice();
		//���1.
		//���屹Ŭ����Ÿ�� �������� = ���ٱ����屹��ü����   //��ĳ����
		//���������̸� -> ���屹�ѱ׸�
		//����Ÿ���� �������� = �ڽİ�ü ����; //��ĳ����
		Ice_77 ice = new P1();
		double_ice.tiger(ice);
		//����Ÿ���� �������� = �ڽİ�ü ����; //��ĳ����
		ice = new P2();
		double_ice.tiger(ice);
		//���2.
		//�ڱ��ڽ�Ŭ����Ÿ���� ���������� �ڱ��ڽ� ��ü ������
		P1 p = new P1();
		double_ice.cat(p);
		P2 p2 = new P2();
		double_ice.dog(p2);
	}
}
