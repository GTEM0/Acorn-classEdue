package java2prj1.day3.lamda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class 사칙연산 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BiFunction<Integer, Integer, Integer> add = (su1, su2) -> {
			return su1 + su2;
		};

		int additionResult = add.apply(10, 20);
		System.out.println("덧셈 결과 : " + additionResult);

		System.out.println("사칙연산하고 싶은 첫번째 숫자 입력해");
		int num1 = sc.nextInt();

		System.out.print("사칙연산하고 싶은 두번째 숫자 입력해 ");
		int num2 = sc.nextInt();

		int additionResult2 = add.apply(num1, num2);
		System.out.println("덧셈 결과 : " + additionResult2);

		BiFunction<Integer, Integer, Integer> sub = (num12, num23) -> num1 - num2;

		int subtractionResult = sub.apply(99, 22);
		System.out.println("뺄셈 결과 : " + subtractionResult);

		BiFunction<Integer, Integer, Integer> mul = (num12, num23) -> num1 * num2;

		int multiplicationResult = mul.apply(11, 11);
		System.out.println("곱셈 결과 : " + multiplicationResult);

		BiFunction<Integer, Integer, Integer> div = (num12, num23) -> {
			if (num1 != 0) {
				return num1 / num2;
			} else {
				System.out.println("제대로 넣어요");
				return 0;
			}
		};

		int divisionResult = div.apply(50, 2);
		System.out.println("나눗셈 결과 : " + divisionResult);

	}
}
