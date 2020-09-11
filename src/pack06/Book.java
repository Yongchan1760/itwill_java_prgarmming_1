package pack06;

public class Book {

	String title;
	String author;
	int price;
	int stockNum;
	int num;
	
	Book(String t, String a ,int p,int n){
		title =t;
		author =a;
		price=p;
		num=n;
	}//»ý¼ºÀÚ
	
	void printInfo() {
		System.out.println(author+" "+title+" "+price+" "+num);
	}

	int stockNumber(int sellNum){
		return stockNum - sellNum;
	}
}