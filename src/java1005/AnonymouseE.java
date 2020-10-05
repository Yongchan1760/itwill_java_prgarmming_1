package java1005;

public class AnonymouseE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous annoy=new Anonymous();
		
		annoy.field.wake();
		
		annoy.method1();
		
		annoy.method2(
			new Person() {
			void study() {
				System.out.println("공부 합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		}
		);
	}

}
