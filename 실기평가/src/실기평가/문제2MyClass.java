package 실기평가;

import java.util.Scanner;

public class 문제2MyClass extends MyClass{

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.print("1부터의 합을 구하고 싶은 숫자를 입력하세요");
	        int number = sc.nextInt();

	        문제2MyClass myClass = new 문제2MyClass();
	        int result = myClass.getTotal(number);

	        System.out.println("1부터 " + number + "까지의 합 : " + result);
	    }

	    
	

}
