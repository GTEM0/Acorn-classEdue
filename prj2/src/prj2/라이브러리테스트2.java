package prj2;

import com.acorn.MG;

public class 라이브러리테스트2 {

	public static void main(String[]args) {
		int[]result = MG.getYak(25);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	
	}
}

