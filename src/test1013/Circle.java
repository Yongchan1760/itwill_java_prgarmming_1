package test1013;

public class Circle {
	 int cir;
	 int x;
	 int y;
	
	public Circle(int cir,int x,int y) {
		this.cir=cir;
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob instanceof Circle) {
			Circle c=(Circle) ob;
			if(cir==c.cir && x==c.x && y==c.y) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		
		return " 원반지름:"+this.cir+" x좌표는"+this.x+" y좌표는"+this.y;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
