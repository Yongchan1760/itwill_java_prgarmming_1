package java1006;

public class TryCatch_3 {

	public static void main(String[] args) {
		try {
		String data1=args[0];
		String data2=args[1];
		int value =Integer.parseInt(data1);
		int value2 =Integer.parseInt(data2);
		int result=value+value2;
		System.out.println("�������"+result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �Ű����� ���� �����մϴ�");
		}catch(Exception e) {
			System.out.println("���� ��ȯ�Ұ�");
		}finally{
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
