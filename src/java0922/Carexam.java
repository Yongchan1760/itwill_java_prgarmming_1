package java0922;

public class Carexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		for(int i=1;i<=5;i++) {
			int problemlocation=car.run();
			
			switch (problemlocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾ü");
				car.frontlefttire=new Hankook("�տ�",15);
				break;
			case 2:
				System.out.println("�տ����� �ѱ�Ÿ�̾ü");
				car.frontlefttire=new Hankook("�տ���",13);
				break;
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾ü");
				car.frontlefttire=new Hankook("�ڿ�",14);
				break;
			case 4:
				System.out.println("�� ������ �ѱ�Ÿ�̾ü");
				car.frontlefttire=new Hankook("�ڿ�����",17);
				break;
			}
			System.out.println("==================");
		}
	}

}
