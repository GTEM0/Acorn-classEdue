package 실기평가;

public class MyClass {
	
	public int getTotal(int su) {
        int sum = 0;
        for (int i = 1; i <= su; i++) {
            sum += i;
        }
        return sum;
    }
}
