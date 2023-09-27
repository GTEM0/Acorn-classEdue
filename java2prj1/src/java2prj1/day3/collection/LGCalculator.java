package java2prj1.day3.collection;

public class LGCalculator implements Calculator{

	@Override
	public int add(int a, int b) {
		System.out.println("add");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("sub");
		return a-b;
	}
	
	
}
