package java2prj1.interfaceEx.myarrys;

import java.util.Comparator;

interface MyComparable<T> {
	// compareTo 메소드 선언: 비교 결과를 정수로 반환
	// 기준 객체와 다른 객체(other)를 비교해 크다면 양수, 작다면 음수, 같으면 0을 반환
	public int compareTo(T other);
}

public class MyArrays {

	public static void sort(Object[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				MyComparable m = (MyComparable) arr[i];

				if (m.compareTo(arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	// 배열을 정렬하는 메소드(sort) - Comparator를 사용한 오버로딩
	public static void sort(Object[] arr, Comparator c) {
		// 버블 정렬 알고리즘을 사용하여 배열을 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (c.compare(arr[i], arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
