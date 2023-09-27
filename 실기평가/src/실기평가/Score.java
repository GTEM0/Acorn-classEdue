package 실기평가;

public class Score {
	
	    String name;
	    private int kor;
	    private int eng;	    
	    private char grade;

	    
	    public Score(String name, int kor, int eng) {
	        this.name = name;
	        this.kor = kor;
	        this.eng = eng;
	        
	    }
	    public Score() {}

	    
	    public void calcGrade() {
	        int total = kor + eng;
	        double average = total / 2.0;

	        if (average >= 90) {
	            grade = 'A';
	        } else if (average >= 80) {
	            grade = 'B';
	        } else if (average >= 70) {
	            grade = 'C';
	        } else if (average >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	    }

	   
	    @Override
	    public String toString() {
	        return "이름 : " + name + "\n국어 점수 : " + kor + "\n영어 점수 : " + eng + "\n학점 : " + grade;
	    }

	    
	}
