package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String answer = null;
		int sum = 0;
		
		System.out.println("식사후 얼마되지 않아서 금방 허기가 진다.(Y/N)>");
		answer = s.nextLine();
		if(answer.equals("Y")) sum++;
		
		if(sum <= 6){
			System.out.println("정상");
		}else if(7 <= sum && sum <= 13){
			System.out.println("탄수화물 중독의 위험");
		}else{
			System.out.println("탄수화물 중독증");
		}
	}

}









