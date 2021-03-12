package d_array;

import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//입력한 숫자만큼 학생의 이름을 랜덤으로 출력하는 프로그램을 만들어주세요.
		
		String[] students = {"오태훈", "조항민", "김정명", "이치우"};
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇명 뽑을까요?");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0;
		do{
			int random = (int)(Math.random() * students.length);
			
			boolean flag = true;
			for(int j = 0; j < pick.length; j++){
				if(students[random].equals(pick[j])){
					flag = false;
				}
			}
			
			if(flag){
				pick[pickCount] = students[random];
				pickCount++;
			}
		}while(pickCount < count);
	}

}











