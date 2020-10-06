package java1006;

public class TryCatch_3 {

	public static void main(String[] args) {
		try {
		String data1=args[0];
		String data2=args[1];
		int value =Integer.parseInt(data1);
		int value2 =Integer.parseInt(data2);
		int result=value+value2;
		System.out.println("결과값은"+result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다");
		}catch(Exception e) {
			System.out.println("숫자 변환불가");
		}finally{
			System.out.println("다시 실행하세요");
		}
	}

}
