package java1005_test;

public class Anonymous {
	Worker field= new Worker() {
		@Override
		public void start() {
			System.out.println("�������� �մϴ�.");
		}
	};
	
	void method1() {
		Worker localVar=new Worker() {
			@Override
			public void start() {
				System.out.println("�׽�Ʈ�� �մϴ�.");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}
