package e_oop.phone;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	private Scanner sc;
	private Day days[];

	public MonthSchedule(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}

	public void input() {
		System.out.print("일정등록하실 날짜를 입력해주세요(1일~30일)");
		int day = Integer.parseInt(sc.nextLine()); //1~30
		System.out.print("일정을 빈칸없이 입력해주세요");
		String work = sc.nextLine();
		day--; 
		if (day < 0 || day > 30) { // 0~30
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);
		
		System.out.println(day+"일의 일정등록을 마쳤습니다");
	}

	public void view() {
		
		System.out.print("일정확인 날짜를 입력해주세요(1일~30일)??");
		int day = Integer.parseInt(sc.nextLine());
		day--;
		if (day < 0 || day > 30) { // 0~30
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은 ");
		days[day].show();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public void run() {
		System.out.print("이번달 스케쥴 관리 프로그램.");
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
				
				
				
				
				
				
			}
		}
	}

/*	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}
*/
}