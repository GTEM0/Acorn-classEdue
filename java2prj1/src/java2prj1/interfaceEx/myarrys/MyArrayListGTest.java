package java2prj1.interfaceEx.myarrys;

public class MyArrayListGTest {

	public static void main(String[] args) {

		MyArrayListG<Score> arrys = new MyArrayListG<>();
		Score a = new Score(100, 90);
		Score b = new Score(60, 90);
		Score c = new Score(70, 88);
		arrys.add(a);
		arrys.add(b);
		arrys.add(c);

		/*
		 * arrys.forEach2( new MyConsumerG<>() {
		 * 
		 * @Override public void accept(Score t) { System.out.println( t);
		 * 
		 * }});
		 */

		class bbb implements MyConsumerG<Score> {

			@Override
			public void accept(Score t) {
				System.out.println(t);
			}
		}

		class ccc implements MyConsumerG<Score> {

			@Override
			public void accept(Score t) {
				System.out.print(t + "점수");
			}
		}

		class ddd implements MyConsumerG<Score> {
			@Override
			public void accept(Score t) {
				System.out.println(t);
			}
		}
	arrys.forEach2(new ddd());

//		arrys.forEach2(new bbb());
//
//		arrys.forEach2(new ccc());
//		
//		arrys.forEach(new ccc());

	
	// arrys.forEach2( new MyConsumerG<>() { });

	}

}
