package test0922_pol;

public class Tire {
	public int maxrotation;
	public int accumulate;
	public String location;
	
	public Tire(String location,int maxrotation) {
		this.location=location;
		this.maxrotation=maxrotation;
	}
	
	public boolean roll() {
		++accumulate;
		if(accumulate<maxrotation) {
			System.out.println(location +"타이어수명:"
		+(maxrotation-accumulate)+"회");
			 return true;
			 
		}else {
			System.out.println("***"+location+"tire펑크**");
			return false;
		}
	}
}

