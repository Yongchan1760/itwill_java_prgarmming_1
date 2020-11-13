package test1110;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		while(i<10) {
			i++;
			if(i%2==1) { 
				continue;
			}
				sum +=i;
				System.out.println(i+" "+sum);
		}
		
	}

}
