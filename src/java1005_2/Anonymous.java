package java1005_2;

public class Anonymous {
	RemoteControl field =new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("tv�� ���ϴ�.");
		}
	};
	
	void  method1() {
		RemoteControl localVar=new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println(" ������� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
