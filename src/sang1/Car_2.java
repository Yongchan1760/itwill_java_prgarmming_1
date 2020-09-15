package sang1;

public class Car_2 {
	String company="현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car_2(){
		
	}
	Car_2(String model){
		this.model=model;
	}
	Car_2(String model, String color){
		this.model=model;
		this.color=color;
	}
	Car_2(String model, String color, int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
}
