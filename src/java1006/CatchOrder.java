package java1006;

public class CatchOrder {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			int value =Integer.parseInt(data1);
			int value2 =Integer.parseInt(data2);
			int result=value+value2;
			System.out.println("결과값은"+result);
			}catch(Exception e) {
				e.printStackTrace();
			}
		

	}

}
