package java2prj2;

public class ForEachExample2 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		System.out.println("몰입 할 수 있는 시간 : " + sum + "분");
	}
	
	
}
