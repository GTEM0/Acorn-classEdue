package java2prj2;

import java.util.Timer;
import java.util.TimerTask;

public class 타이머 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2};
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		int minutes = sum; 

		System.out.println("몰입 할 수 있는 시간 : " + sum + "분");

		Timer timer = new Timer();

		TimerTask alarmTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("알람이 울립니다!");
			}
		};

		timer.schedule(alarmTask, minutes * 60 * 1000);

		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("프로그램을 종료합니다.");
				timer.cancel();
			}
		}, (minutes + 1) * 60 * 1000); 
	}

}
