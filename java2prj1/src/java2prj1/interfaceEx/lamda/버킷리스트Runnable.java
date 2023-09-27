package java2prj1.interfaceEx.lamda;

public class 버킷리스트Runnable {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("1. 코딩 잘하기");
		r.run();

		Runnable r2 = new Runnable() {

			public void run() {
				System.out.println("2. 검은마법사 해방시켜주기");
			}
		};

		r2.run();

		class A implements Runnable {
			@Override
			public void run() {
				System.out.println("3. 건강하기");
			}
		}
		A a = new A();
		a.run();

	}
}
