package test1102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class Product {
	private List<Product> list=new ArrayList<Product>();
	private Scanner scanner=new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("----------");
			System.out.println("1. ��� 2. ��� 3. ����");
			System.out.println("-------------");
			
			System.out.println("����");
			String select =scanner.nextLine();
			switch (select) {
			case "1":Regis();break;
				
			//case "2":showProduct();break;
			
			case "3":return;

			
			}
		}
	}
	
	public void Regis() {
		try {
			Test2 test=new Test2();
			test.setpno(++counter);
			
			System.out.println("��ǰ��");
			test.Setname(scanner.nextLine());
			
			System.out.println("����");
			
			
			//System.out.println("���");
			test.Setname(scanner.nextLine());
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
