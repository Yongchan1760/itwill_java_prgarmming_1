package java0922;

public class Kum extends Tire{
	
		public Kum(String location,int maxrotation) {
			super(location, maxrotation);
		}
		@Override
		public boolean roll() {
			++accumulate;
			if(accumulate<maxrotation) {
				System.out.println(location +"한국타이어수명:"
			+(maxrotation-accumulate)+"회");
				 return true;
				 
			}else {
				System.out.println("***"+location+"한국tire펑크**");
				return false;
			}
		}

}
