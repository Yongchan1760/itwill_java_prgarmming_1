package java0919;

public class Printer {
		String name;
		int num;
		void println(int a) {
			System.out.println(a);
		}
		void println(boolean a) {
			System.out.println(a);
		}
		void println(double a) {
			System.out.println(a);
		}
		void println(String a) {
			System.out.println(a);
		}
		void pritnln(String a,int c) {
			this.name=a;
			this.num=c;
			System.out.println(a+","+c);
		}
}
