package test0922_pol;

public class Hankook extends Tire{
	public Hankook(String location,int maxrotation) {
		super(location, maxrotation);
	}
	
	@Override
	public boolean roll() {
		++accumulate;
		if(accumulate<maxrotation) {
			System.out.println(location +"�ѱ�Ÿ�̾����:"
		+(maxrotation-accumulate)+"ȸ");
			 return true;
			 
		}else {
			System.out.println("***"+location+"�ѱ�tire��ũ**");
			return false;
		}
	}
}
