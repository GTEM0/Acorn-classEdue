package 실기평가;

import java.util.Scanner;

public class 문제3 extends MyCalculator{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요");
        int num1 = sc.nextInt();

        System.out.print("두 번째 수를 입력하세요");
        int num2 = sc.nextInt();

        int result = multi(num1, num2);
        System.out.println("결과 : " + result);
    }

	
}
