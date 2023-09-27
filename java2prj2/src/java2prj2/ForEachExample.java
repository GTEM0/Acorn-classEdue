package java2prj2;

import java.util.ArrayList;

public class ForEachExample {
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<>();
		books.add("무서운게 딱좋아");
		books.add("천개의 찬란한 태양");
		books.add("연을 쫓는 아이");
		books.add("비밀");
		books.add("총,균,쇠");

		books.forEach(book -> System.out.println(book));
	}
}



