package c_statement;

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
			
		
				
				}
			}
		
		
	}



		
	

