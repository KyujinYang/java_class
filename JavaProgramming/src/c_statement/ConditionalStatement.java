package c_statement;

import java.util.Scanner;
public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식 //boolean){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if뒤에 추가한다.
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
		
		
		int a = 1;
		// 조건식 == 비교연산자)
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다");	
		}
		
		if(a==0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다");
		}
		
	
		
		if (a == 1){
			System.out.println("a가 1인 경우에 하고 싶은 것");
			}
		else if (a == 2){
			System.out.println("a가 2인 경우에 하고 싶은 것");
			}
		else if (a == 3){
			System.out.println("a가 3인 경우에 하고 싶은 것");
			}	
		else {
			System.out.println("이외의 경우에 하고 싶은 것");
			}
		
		/* 
		 실수하는 경우
		1. 조건을 한묶음으로 사용하기 위해서는 반드시 esle if를 사용해야 한다.
		*/
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}
		if(a < 20){
			System.out.println("a가 20보다 작다");
			
		/*
		 * else if(a < 20){
			System.out.println("a가 20보다 작다");
			출력의 결과물이 다르다.  else if는 묶음
		 */
		 
		/*
		 * 문제1. 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		 */
			
			int score = 50;
			if(60 <= score){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
		
		
		/*
		 * 문제2. 성적에 등급을 부여하는 프로그램
		 */
			score = 25;
			String grade = null;
			if(90 <= score){
				grade = "A";
			}else if(80 <= score && score < 90){
				grade = "B"; 
			}else if(70 <= score && score < 80){
				grade = "C";
			}else if(60 <= score && score < 70){
				grade = "D";
			}else{ 
				grade = "F";
				}

			System.out.println(score + "점에 해당하는 등급은" + grade + "입니다");	
		
			score = 80;
			grade = null;
			
			if(90 <= score){
				grade = "A";
				if(97 < score){
					grade += "+";
				}else if(score <= 93){
					grade += "-";
				}
			}else if(80 <= score){
				grade = "B";
				if(87 < score){
					grade += "+";
				}else if(score <= 83){
					grade += "-";
				}
			}else if(70 <= score){
				grade = "C";
				if(77 < score){
					grade += "+";
				}else if(score <= 73){
					grade += "-";
				}
			}else if(60 <= score){
				grade = "D";
				if(67 < score){
					grade += "+";
				}else if(score <= 63){
					grade += "-";
				}
			}else{
				grade = "F";
			} 
			System.out.println(score + "점에 해당하는 점수는" + grade + "입니다");
			
		
				
				
		
		/*
		 * switch문
		 * -switch(int/String){case1:break;}
		 * -조건식의 결과는 정수의 문자열만 (JDK1.7부터 문자열 허용)허용한다.
		 * -조건식과 일치하는 CASE문 이후의 문장을 수행한다.
		 */
		
		a =5;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고 싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고 싶은 것");
			break;
		default: //if문의 else와 같은 것
			System.out.println("a가 3인 경우에 하고 싶은 것");
		}	
		
		String b = "a";
		
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
		break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고 싶은 것");
		break;
		default: 
			System.out.println("이외에 하고 싶은 것");
		}
		//  "\"는 escape문장
		// switch문은 사용하는 경우가 제한적이다. 왜냐하면 정확히 일치하는 값만 실행되어서 제한적이다. 같은 문장일 경우 if문보다 Switch문이 빠르기에 이용함.

		// switch문 예제1
		//주어진 월에 해당하는 계절을 출력	
		int month = 1;
		String season = null;
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은" + season + "입니다");
	
		
		score = 90;
		grade = null;
		switch(score / 10){
		
		case 10: case 9: grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "c"; break;
		case 6 : grade = "d"; break;
		default: grade = "f";
		}
		
		System.out.println(score + "해당하는 등급은" + grade + "입니다");
		
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
		Scanner sc = new Scanner(System.in);
		 
//		int number = Integer.parseInt(sc.nextLine());
//		
//		
//		switch(number){
//	
//		case 0: 
//			System.out.println("0입니다");
//		 break;
//		 default:
//				System.out.println("0 이 아닙니다.");
//		}
//		}
//		
/*		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 입력해주세요
		int number = Integer.parseInt(sc.nextLine());
		
		if(number %2 == 0){
			System.out.println("짝수");}
			else{
				System.out.println("홀수");
			}
		
		
*/		
	
		/*//점수 3개를 입력받아 총점,평균,등급을 출력해주세요
		System.out.print("첫번째 숫자");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 숫자");
		int z = Integer.parseInt(sc.nextLine());
		
		int total = x+y +z;			
		System.out.println("총 합계는"+ total + "입니다");
		
		double avg = (x+y+z) / 3;
		System.out.println("3개값의 평균은"+ avg + "입니다");
		
		if(90 <= avg){
			grade = "A";
			if(97 < avg){
				grade += "+";
			}else if(avg <= 93){
				grade += "-";
			}
		}else if(80 <= avg){
			grade = "B";
			if(87 < avg){
				grade += "+";
			}else if(avg <= 83){
				grade += "-";
			}
		}else if(70 <= avg){
			grade = "C";
			if(77 < avg){
				grade += "+";
			}else if(avg <= 73){
				grade += "-";
			}
		}else if(60 <= avg){
			grade = "D";
			if(67 < avg){
				grade += "+";
			}else if(avg <= 63){
				grade += "-";
			}
		}else{
			grade = "F";
		} 
		System.out.println("총점: " + total + " / 평균: " + avg + "/ 등급: " + grade);

		*/
		
		//1~100사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요
		
		Math.random();
		int random1 = (int)(Math.random() * 100) +1;
		int random2 = (int)(Math.random() * 100) +1;
		int random3 = (int)(Math.random() * 100) +1;
		System.out.println("1은" + random1);
		System.out.println("2은" + random2);
		System.out.println("3은" + random3);
		
		int num = 0;
		
		if(random1 > random2 && random2 > random3)
			num = random1;{
			System.out.println("첫번째 숫자가 " + random1);
		}
			/*if(random1 < random2 && random2 > random3 ){
			System.out.println("두번째 숫자가 " + random2);
			}else if(random1 > ){
				grade += "-";
			}
	
	*/	
		
/*		int arr[] = {random1, random2, random3};
		Arrays.sort(arr);
		for (int i:arr) {
		System.out.print(arr);
		sc.close();}*/
		
			
		
			
	//_______________________________________________
	
	
	int x = (int)(Math.random() * 100) + 1;
	int y = (int)(Math.random() * 100) + 1;
	int z = (int)(Math.random() * 100) + 1;
	
	if(x>y){
		int temp = x;
		x = y;
		y = temp;
	}
	if(x>z){
		int temp = x;
		x=z;
		z=temp;
	}
	if(y>z){
		int temp = y;
		y= z;
		z =temp;
	}
	System.out.println("x"+x+"<"+"y"+y+"<"+"z"+z);
		
	/* 방법을 생각해 낸 것을 코드로 입력할 줄 알아야 해
	 * 방법은 경험이 쌓이면 해결되지만
	 * 급한건..내가 표현하고 싶은 것을 코드로 표현할 줄 알아야한다.
	 * 어떠한 연습이냐면
	 * 했던걸 또하고..
	 * 주석만 보고 코드짜기
	 */
		
		
	}
}
	}
