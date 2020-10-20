package test1020;

public class Calculator {
 private int memory;
 
 public int getMomory() {
	return memory;
}
 public void setMemory(int memory) {
	this.memory=memory;
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println(Thread.currentThread().getName()+" "+this.memory);
}
 
}
