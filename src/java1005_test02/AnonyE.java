package java1005_test02;

public class AnonyE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony =new Anonymous();
		
		anony.field.run();
		
		anony.method1();
		
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
				
			);
	}

}
