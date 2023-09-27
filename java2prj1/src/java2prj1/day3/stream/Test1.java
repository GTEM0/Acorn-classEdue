package java2prj1.day3.stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {

		// 유일한 로또 번호를 저장하기 위한 HashSet을 생성합니다.
		HashSet<Integer> lottos = new HashSet<Integer>(); // 우측 <>안에 생략 가능
		Random r = new Random();

		// 20번 반복하여 무작위 로또 번호를 생성하고 HashSet에 추가합니다.
		for (int i = 0; i < 20; i++) {
			lottos.add(r.nextInt(46));
		}

		// HashSet에 저장된 유일한 번호의 개수를 출력합니다.
		System.out.println(lottos.size());

		// HashSet을 배열로 변환합니다.
		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];

		// 배열에서 처음 6개의 요소를 복사하여 result 배열에 저장합니다.
		System.arraycopy(lottosArray, 0, result, 0, 6);

		// 복사된 로또 번호를 출력합니다.
		System.out.println("lotto number!!!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "  ");
		}

		// IntStream을 사용하여 1부터 45 사이의 난수를 생성합니다.
		IntStream is = new Random().ints(1, 46);

		// 스트림을 이용하여 중복을 제거하고, 6개의 번호를 선택하고 정렬한 후 출력합니다.
		System.out.println("\n 스트림으로 lotto 생성");
		is.distinct().limit(6).sorted().forEach(number -> System.out.print(number + " "));
	}

}
