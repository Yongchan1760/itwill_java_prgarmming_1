package java1006;

public class TryCatch_2 {

	public static void main(String[] args) {
		String data1= null;
		String data2=null;
		try {
			data1=args[0];
			data2=args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개변수가 부족합니다");
			return ;
		}
		try {
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println("결과값은?"+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		}finally {
			System.out.println("다시 설정을 하세용~");
		}

	}

}
