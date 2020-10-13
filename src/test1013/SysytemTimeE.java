package test1013;

public class SysytemTimeE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1=System.nanoTime();
		
		int sum=0;
		for (int i = 0; i < 1000000; i++) {
			sum+=i;
		}
		long time2=System.nanoTime();
		System.out.println("총 걸린 시간의 합="+sum);
		
		System.out.println("계산 소요 시간"+(time2-time1));
	}

}
