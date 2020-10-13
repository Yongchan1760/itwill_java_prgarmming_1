package test1013;

public class CircleE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//원의 반지름, 좌표 x, 자표 y
		Circle c1= new Circle(30,10,10);
		Circle c2=new Circle(20,10,10);
		Circle c3=new Circle(20,20,10);
		
		//반지름 크기가 같으면 같은 원이다.
		//반지름 크기가 같고 자표가 같으면 같은 원이다.
		if(c2.equals(c3)) {
			System.out.println("같은원 " +c2);
		}
		else
			System.out.println("다른원 " +c3+""+c2);
	}

}
