package java2prj1.day3.lamda;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비교하고 싶은 첫번째 숫자 입력해");
		int num1 = sc.nextInt();

		System.out.print("비교하고 싶은 두번째 숫자 입력해 ");
		int num2 = sc.nextInt();
		BiPredicate<Integer, Integer> isGreaterThan = (su1, su2) -> num1 > num2;

		if (isGreaterThan.test(num1, num2)) {
			System.out.println(num1 + "이(가)" + num2 + "보다 크다");
		} else {
			System.out.println(num1 + "이(가)" + num2 + "보다 작다");
		}
	}
}

