package java1005_test;

public class AnonymouseE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony =new Anonymous();
		
		anony.field.start();
		
		anony.method1();
		
		anony.method2(
				new Worker() {
					@Override
					public void start() {
						System.out.println("테스트를 합니다.");
					}
				}
		);
	}

}
