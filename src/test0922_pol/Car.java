package test0922_pol;

public class Car {
		Tire frontlefttire=new Tire("�տ���",6);
		Tire frontrigttire=new Tire("�տ�����",2);
		Tire backlefttire=new Tire("�ڿ���",3);
		Tire backrighttire=new Tire("�ڿ�����",4);
		
		int run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
			if(frontlefttire.roll()==false) {
				stop();
				return 1;
			}
			if(frontrigttire.roll()==false) {
				stop();
				return 2;
			}
			if(backlefttire.roll()==false) {
				stop();
				return 3;
			}
			if(backrighttire.roll()==false) {
				stop();
				return 4;
			}
			return 0;
		}
		
		void stop() {
			System.out.println("�ڵ����� ����ϴ�.");
		}
}
