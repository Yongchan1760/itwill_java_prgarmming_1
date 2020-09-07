package test1;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 :");
		int a=sc.nextInt();
		
	    if(a>=90) {
	    	System.out.println("A");
	    }
	    else if(a>=80) {
	    	System.out.println("B");
	    }
	    else if(a>=70) {
	    	System.out.println("C");
	    }
	    else if(a>=60) {
	    	System.out.println("D");
	    }
	    else
	    	System.out.println("F");
	}
}

//		switch(a/10) {
//	      case 9:
//	    	  System.out.println("A");
//	    	  break;
//	      case 8:
//	    	  System.out.println("B");
//	    	  break;
//	      case 7:
//	    	  System.out.println("C");
//	    	  break;
//	      case 6:
//	    	  System.out.println("D");
//	    	  break;
//	      case 5:
//	    	  System.out.println("E");
//	    	  break;
//	    }
//	}
//}
