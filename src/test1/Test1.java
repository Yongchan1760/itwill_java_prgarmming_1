package test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 100; //변수선언, 초기값
		count = (int)200.0;
		System.out.println(count);
		
		short data1 = 20;
		count = data1;
		
		long longData = count;
		
		System.out.println(count);
		System.out.println(longData);
		
		float area;
		area = (float)0.0;
		area = 100L; //자동 형변환
		
		char grade;
		grade = 'A';
		grade = (char)count;
		System.out.println(count);
		
		int c = 'B';
		
		boolean isEqual;
		isEqual = true;
		
		int data2 = 100;
		int data3 = 200;
		int data4 = 50;
		
		int max = (data2>data3)?data2:data3;
		max = (max>data4)?max:data4;		   
		int min = (data2<data3)?data2:data3;
		min = (min<data4)?min:data4;
		
		System.out.println("김동환");

	}

}
