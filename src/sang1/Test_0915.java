package sang1;

public class Test_0915 {
	int sum1(int[]value) {
		int sum=0;
		for (int i = 0; i < value.length; i++) {
			sum+=value[i];
		}
		return sum;
	}
	int sum2(int ... value) {
		int sum=0;
		for (int i = 0; i < value.length; i++) {
			sum+=value[i];
		}
		return sum;
	}
}
