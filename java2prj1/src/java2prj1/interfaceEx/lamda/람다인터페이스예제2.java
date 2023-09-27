package java2prj1.interfaceEx.lamda;

//Calculator 인터페이스 정의
interface Calculator2 {
	int calculate(int a, int b); // 두 정수를 입력으로 받아 연산 결과를 반환하는 메서드 선언
}

public class 람다인터페이스예제2 {
	public static void main(String[] args) {
		// 람다식을 사용하여 Calculator 인터페이스를 구현

		Calculator addition = (a, b) -> a + b;

		Calculator subtraction = (a, b) -> a - b;

		Calculator multiplication = (a, b) -> a * b;

		Calculator division = (a, b) -> {
			if (b != 0) { // 0으로 나누지 않도록 예외 처리
				return a / b;
			} else {
				throw new IllegalArgumentException("Divisor cannot be zero.");
			}
		};

		int result1 = addition.calculate(10, 5);
		int result2 = subtraction.calculate(10, 5);
		int result3 = multiplication.calculate(10, 5);
		int result4 = division.calculate(10, 5);

		System.out.println("Addition: " + result1);
		System.out.println("Subtraction: " + result2);
		System.out.println("Multiplication: " + result3);
		System.out.println("Division: " + result4);
	}

	interface Calculator {
		int calculate(int a, int b);
	}

	class Addition implements Calculator {
		@Override
		public int calculate(int a, int b) {
			return a + b;
		}
	}

	class Subtraction implements Calculator {
		@Override
		public int calculate(int a, int b) {
			return a - b;
		}
	}

	class Multiplication implements Calculator {
		@Override
		public int calculate(int a, int b) {
			return a * b;
		}
	}

	class Division implements Calculator {
		@Override
		public int calculate(int a, int b) {
			if (b != 0) {
				return a / b;
			} else {
				throw new IllegalArgumentException("0으로 못나눔");
			}
		}
	}

//	public class Main {
//		public static void main(String[] args) {
//			Calculator addition = new Addition();
//			Calculator subtraction = new Subtraction();
//			Calculator multiplication = new Multiplication();
//			Calculator division = new Division();
//
//			int result1 = addition.calculate(10, 5);
//			int result2 = subtraction.calculate(10, 5);
//			int result3 = multiplication.calculate(10, 5);
//			int result4 = division.calculate(10, 5);
//
//			System.out.println("Addition: " + result1);
//			System.out.println("Subtraction: " + result2);
//			System.out.println("Multiplication: " + result3);
//			System.out.println("Division: " + result4);
//		}
//	}

}
