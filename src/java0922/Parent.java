package java0922;

public class Parent {
	public String nation;
	
	
	public Parent (){
		this("¥Î«—πŒ±π");
		System.out.println("parent call");
	}
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("parent call(string nation)");
	}
}

