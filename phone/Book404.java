package e_oop.phone;

import e_oop.N7_ScanUtil;
import f_game.MyGame;


public class Book404 {

	//대상은 만들었고 여기서부터는 게임내용
	//1. 변수만들기 - 캐릭터등장
	
	
	PhoneBook_404 names;
	PhoneBook_404 number;
	PhoneBook_404[] PhoneBook_404;
	
	//지역변수 만들어 함.
	
	//2. 생성자 만들기
	Book404(){
		PhoneBook_404 = new PhoneBook_404[25];
		PhoneBook_404[0] = new PhoneBook_404("양규진", "010-7241-7633");
	}
	
	/*
	public static void main(String[] args) {
		//3. 객체생성 후 start메서드 호출
		//start 만들어 호출
		//main메서드에서 바로 만들어도 되지만 static이 있으면 객체생성을 하고 만들어야 해서 불편하기에
		//처음부터 객체생성해서 메서드 만들어놓고 게임시작
		new book404().start();
		}
	
	void start(){
		System.out.print(PhoneBook_404[0].names);
		System.out.print("\t"+PhoneBook_404[0].number);
	}
	*/

}


