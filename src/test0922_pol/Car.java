package test0922_pol;

public class Car {
		Tire frontlefttire=new Tire("앞왼쪽",6);
		Tire frontrigttire=new Tire("앞오른쪽",2);
		Tire backlefttire=new Tire("뒤왼쪽",3);
		Tire backrighttire=new Tire("뒤오른쪽",4);
		
		int run() {
			System.out.println("자동차가 달립니다.");
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
			System.out.println("자동차가 멈춥니다.");
		}
}
