package java0921;

public class Com_cal extends Cal {
	@Override
	double areac(double r){
		System.out.println("컴퓨터 객체의 areac() 실행");
		return Math.PI*r*r;
	}
}
