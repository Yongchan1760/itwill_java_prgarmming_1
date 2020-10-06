package ch11;

public class Smart {
	private String company;
	private String os;
	
	public Smart(String company ,String os) {
		this.company=company;
		this.os=os;
		}
	@Override
	public String toString(){
		return company+","+os;
	}
}

