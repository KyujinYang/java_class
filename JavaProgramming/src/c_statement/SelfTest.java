package c_statement;
import java.util.Scanner;
public class SelfTest {

	public static void main(String[] args) {
		// 검사프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 질문을 읽고 해당하면 y를 해당하지 않으면 n을 입력해주세요.");
		System.out.println();
		
		
		String yes = null;
		String no = null;
		int sum = 0;
		String answer = null;
		
	
		
				
		System.out.println("1.식사후 얼마되지 않아서 금방 허기가진다");
		String q1 = sc.nextLine();
		if(q1.equals("y")){sum++;
		}
		
		

		System.out.println("2.식사후 단맛이 도는 디저트를 즐긴다");
		String q2 = sc.nextLine();
		if(q2.equals("y")){sum++;
		}
		System.out.println("3.원두커피보다는 설탕을 넣은 커피를 즐긴다");
		String q3 = sc.nextLine();
		if(q2.equals("y")){sum++;
		}
		System.out.println("4.스트레스를 받으면 식욕이 당긴다");
		String q4 = sc.nextLine();
		if(q4.equals("y")){sum++;
		}
		System.out.println("5.스트레스를 받았을 때에 간식을 먹게 되면 기분이 안정이 된다");
		String q5 = sc.nextLine();
		if(q5.equals("y")){sum++;
		}
		System.out.println("6.무언가 먹지 않으면 불안한 느낌이 들면서 일이나 공부등에 집중하기 힘들다");
		String q6 = sc.nextLine();
		if(q6.equals("y")){sum++;
		}
		System.out.println("7.습관적으로 빵이나 과자를 찾게 된다");
		String q7 = sc.nextLine();
		if(q7.equals("y")){sum++;
		}
		System.out.println("8.아침을 거른날보다, 아침을 먹은 날이 점심시간이 되기 전에 더욱 배가 고프다");
		String q8 = sc.nextLine();
		if(q8.equals("y")){sum++;
		}
		System.out.println("9.패스트푸드나 인스턴트 식품을 즐겨먹는다");
		String q9 = sc.nextLine();
		if(q9.equals("y")){sum++;
		}
		System.out.println("10.식사 후 졸리고 나른한 경우가 종종있다");
		String q10 = sc.nextLine();
		if(q10.equals("y")){sum++;
		}
		System.out.println("11.빵이나 과자, 케익을 먹기 시작하면 양을 조절하지 못하고 끊임없이 먹게 된다");
		String q11 = sc.nextLine();
		if(q11.equals("y")){sum++;
		}
		System.out.println("12많이 먹어도 배가 부른 느낌이 쉽게 들지 않는다");
		String q12 = sc.nextLine();
		if(q12.equals("y")){sum++;
		}
		System.out.println("13.부모님 중 혈압,당뇨,심장병,고지혈 증 등의 순환기질환을 가진 분이 계신다");
		String q13 = sc.nextLine();
		if(q13.equals("y")){sum++;
		}
		System.out.println("14.잡곡밥보다는 흰쌀밥을 선호한다");
		String q14 = sc.nextLine();
		if(q14.equals("y")){sum++;
		}
		System.out.println("15. 밀가루음식(스파게티,흰식빵,케익류 등)을 선호하며 일주일에 3회이상 밀가루 음식을 먹는다");
		String q15 = sc.nextLine();
		if(q15.equals("y")){sum++;
		}
		System.out.println("16.배가 불러도 입에서 음식이 당겨 음식을 제한하지 못한다");
		String q16 = sc.nextLine();
		if(q16.equals("y")){sum++;
		}
		System.out.println("17.맛있는 음식을 먹는 상상을 하거나 음식을 보아도 먹고 싶은 욕구가 강하게 든다");
		String q17 = sc.nextLine();
		System.out.println("18.평소 운동을 규칙적으로 하지 않고 생활 운동량도 많지 않다");
		if(q17.equals("y")){sum++;
		}
		String q18 = sc.nextLine();
		System.out.println("19.체중을 감량하더라도 다시 쉽게 찐다.");
		if(q18.equals("y")){sum++;
		}
		String q19 = sc.nextLine();
		System.out.println("20.부모형제나 친인척 중에 비만인 사람이 있다");
		if(q19.equals("y")){sum++;
		}
		String q20 = sc.nextLine();
		if(q20.equals("y")){sum++;
		}
		

		   if(sum >= 14){
			   System.out.println("총 합계는 "+sum+"개로 " + "탄수화물 중독증" + "입니다");
		   }
		     else if(sum >= 7){
			       System.out.println("총 합계는 "+sum+"개로 " + "탄수화물 중독의 위험" + "입니다");
			  }
		     else {
				   System.out.println(("총 합계는 "+sum+"개로" + "정상" + "입니다"));
				  }
		
		
		
/*			{System.out.println("해당하면 y를 비해당시 n을 입력해주세요.");}
			
		if ("y"<= 6){
			System.out.println("정상입니다")};
			
		if else (num <=13){
			System.out.println("탄수화물 중독의 위험");}
		else {
			System.out.println("탄수화물 중독증입니다");
		}
		
		if ("y" == "y" + 1)
		else ("n") == "n" +1);
		

		*/

	}

}
