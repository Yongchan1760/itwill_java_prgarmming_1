package packtest1_1;

import packtest1.*;
public class B {
	public B() {
		A a=new A();
		a.field1=1;
		//a.field2=1;
		//a.field3=1;
		//private 자체는 그 소스파일에서만 사용할수있고
		// 그외의 같은 패키지 안에서 사용이 불가능하며 다른 패키지에서도
		//사용이 불가능하다 오로지 자기 클래스 내부에서만 사용가능하다.
		// 디폴트 제한자는 같은 패키지안에서는 사용가능하고
		// 다른 패키지에서는 사용이 불가능하다.
	}
}
