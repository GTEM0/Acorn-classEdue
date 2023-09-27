package 실기평가;

public class ScoreTest extends Score{
	
	public ScoreTest(String name, int kor, int eng) {
		super(name, kor, eng);
		
	}
	
		public static void main(String[] args) {
	        
	        ScoreTest s1 = new ScoreTest("이학생", 90, 90);
	        s1.calcGrade();

	        ScoreTest s2 = new ScoreTest("김학생", 80, 82);
	        s2.calcGrade();
	        
	        ScoreTest s3 = new ScoreTest("전학생", 60, 70);
	        s3.calcGrade();
	        
	        System.out.println("학생1\n" + s1.toString() + "\n");
	        System.out.println("학생2\n" + s2.toString() + "\n");
	        System.out.println("학생3\n" + s3.toString() + "\n");
	    }
	}
