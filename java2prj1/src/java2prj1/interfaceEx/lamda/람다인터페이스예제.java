package java2prj1.interfaceEx.lamda;


interface Calculator {
    int calculate(int a, int b);
}

public class 람다인터페이스예제 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
            	System.out.println("0으로 못나눔");
            }
			return 0;
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
}

