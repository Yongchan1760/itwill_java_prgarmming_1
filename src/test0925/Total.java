package test0925;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------");
		
		Animal animal =null;
		
		animal =new Dog();
		animal.sound();//오버라이드
		animal =new Cat();
		animal.sound();
		System.out.println("-------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		
		
	}


