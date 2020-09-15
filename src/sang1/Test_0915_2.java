package sang1;

public class Test_0915_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_0915 c1=new Test_0915();
		int []value= {10,20,30};
		int result=c1.sum1(value);
		System.out.println(result);
		System.out.println();
		int result2=c1.sum1(new int[] {10,20,30});
		System.out.println(result2);
		System.out.println();
		Test_0915 c2=new Test_0915();
		int result3=c2.sum2(1,2,3);
		System.out.println(result3);
		System.out.println();
		int result4=c2.sum2(1,2,3,4,5,6);
		System.out.println(result4);
		System.out.println();
	}

}
