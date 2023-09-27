package java2prj1.interfaceEx.myarrys;

public class Score implements MyComparable<Score> {

	int kor;
	int eng;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}

	public Score(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}

	public Score() {

	}

	@Override
	public int compareTo(Score other) {
		Score s = (Score) other;
		return this.eng - s.eng;
	}

//	@Override
//	public int compareTo(Object other) {
//		Score s = (Score) other;
//		return this.eng - s.eng;
//	}
	//제네릭 버전?
	 
}
