package java1005_2;

public class Anonymous {
	RemoteControl field =new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("tv를 끕니다.");
		}
	};
	
	void  method1() {
		RemoteControl localVar=new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println(" 오디오를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
