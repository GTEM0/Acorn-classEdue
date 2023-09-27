package java2prj1.interfaceEx.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class MovingList {

	public static void main(String[] args) {

		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 98));
		list.add(new Moving("김두식", "문산", 99));
		list.add(new Moving("전영석", "봉평", 98));

		// 이름순으로 정렬
		Collections.sort(list);
		list.forEach(m -> System.out.println(m));

		System.out.println("=======>");
		list.forEach(new Consumer<>() {
			@Override
			public void accept(Moving t) {

				System.out.println(t);
			}
		});

		System.out.println("=======>");
		class ConsumerImp implements Consumer<Moving> {
			@Override
			public void accept(Moving t) {
				System.out.println(t);
			}
		}
		System.out.println("=======>");
		list.forEach(new ConsumerImp());

		// 암호순 정렬

//1. 익명클래스
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				ArrayList<Moving> l1 = (ArrayList<Moving>) o1;
				ArrayList<Moving> l2 = (ArrayList<Moving>) o2;
				return 0;
			}});

		// 파워순 정렬
		
		
		
		
		
		
	}
}
