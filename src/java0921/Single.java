package java0921;

public class Single {
	private static Single a=new Single();
	
	static Single getInstance() {
		return a;
	}
}
