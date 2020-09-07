package test1;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='a';
		System.out.println(c1);
		char c2=65;
		System.out.println(c2);
		char c5 =44032;
		System.out.println(c5);
		String name ="홍길동";
		System.out.println(name);
		char c6=0x0041;
		//char c7= ;
		System.out.println(c6);
		char a='\uac00';
		System.out.println(a);
		boolean stop=false;
		if(stop) {
			System.out.println("정지");
		}
		else
			System.out.println("출발");
		double var1=3e6;
		System.out.println(var1);
		float var2 =3e6f;
		System.out.println(var2);
		double var3 =2e-3;
		System.out.println(var3);
		double var4= 2e-3;//e에 승이 지정되야함 양수 음수 0  다와도됨
		System.out.println(var4);
		float y=3.14f;
		int sum=(int)y;
		System.out.println(sum);
		byte r=10+20;
		System.out.println(r);
		long v1=1000L;
		System.out.println(v1);
		double result =1.2f+3.4;
		System.out.println(result);
		System.out.println();
		int x=1;
		int x1=2;
		double r1=(double)x/x1;
		System.out.println(r1);
		double y2=1;
		int y3=2;
		double yy=y2/y3;
		System.out.println(yy);
	}

}
