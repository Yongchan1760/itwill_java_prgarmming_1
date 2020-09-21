package java0921;

public class Single_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single a1=Single.getInstance();
		Single a2=Single.getInstance();
		if(a1==a2) {
			System.out.println("°°Àº°´Ã¼");
		}
		else {
				System.out.println("´Ù¸¥°´Ã¼");
			}

		}
	}


