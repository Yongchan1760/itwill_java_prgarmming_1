package java0922;

public class Carexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		for(int i=1;i<=5;i++) {
			int problemlocation=car.run();
			
			switch (problemlocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어교체");
				car.frontlefttire=new Hankook("앞왼",15);
				break;
			case 2:
				System.out.println("앞오른쪽 한국타이어교체");
				car.frontlefttire=new Hankook("앞오른",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어교체");
				car.frontlefttire=new Hankook("뒤왼",14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 한국타이어교체");
				car.frontlefttire=new Hankook("뒤오른쪽",17);
				break;
			}
			System.out.println("==================");
		}
	}

}
