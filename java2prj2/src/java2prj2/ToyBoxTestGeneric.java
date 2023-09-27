package java2prj2;

public class ToyBoxTestGeneric {

	public static void main(String[] args) {

		ToyBox<Play> list = new ToyBox<>();

		Play a = new Play("이정훈", 100, 1);
		Play b = new Play("조은경", 98, 3);
		Play c = new Play("이윤", 99, 2);

		list.add(a);
		list.add(b);
		list.add(c);

		for (int i = 0; i < list.size(); i++) {
			Play p = list.get(i);
			System.out.println(p);
			System.out.println(p.getScore());
		}
		ToyBox<Food> f2 = new ToyBox<>();
		//f2.add(new Food("콩순이 짜장세트"));
		

		class ttt implements ToyBoxT<Play> {

			@Override
			public void save(Play s) {
				System.out.println(s);
			}

		}
		list.forEach(new ttt());

	}
}
