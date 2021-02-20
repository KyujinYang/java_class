package a_variable; //클래스의 위치

import java.util.Scanner; // 다른 패키지에 있는 클래스의 위치를 알려주는 것
//Ctrl + Shift + o: 자동으로 클래스 찾아줌


public class Variable { // {중괄호: 블록 중괄호 안: class 내용}

	public static void main(String[] args) { 
		//main: 메소드 이름, 이름 뒤에 소괄호가 있으면 () 메소드
		//main메소드: 프로그램의 시작과 끝
		
		//한줄 주석: ctrl + shift + c
		
		//범위 주석: ctrl+shift+/ 끝:*/ 해제: \
		
		/* 문법의 내용: 프로그래밍이란 데이터를 만들어 놓고 데이터를 조작하여 새로운 프로그램을 만듦.
		 * 
		 * 데이터
		 * -기본형
		 * -배열
		 * -클래스
		 * 
		 * 조작
		 * -산술연산
		 * -비교연산
		 * -논리연산
		 * -조건문
		 * -반복문
		 *
		 */

		
		/*
		 * 기본형타입
		 * - 정수: byte(1) short(2) *int(4) long(8)
		 * - 실수: float(4), *double(8)
		 * - 문자: char(2)
		 * - 논리: boolean(1)
		 * 
		 */
		
		int x; //정수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
		//변수를 만드는 것을 변수 선언이라고 표현.
		
		// double x; : 블록{}안에 이름이 중복될 수 없다.
		double y;
		
	
		//=(대입연산자): 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화: 변수에 처음으로 값을 저장
		y = 3.14; //변수에 타입에 맞는 값을 저장
		
		int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float 타입이 된다. 아닐경우 double
		char c = '양'; //따옴표안에 반드시 한글자를 넣어야 한다.
		boolean b = true; //true, false 
		
		//8가지 기본형 타입 사용해 8개 변수 선언 및 초기화
		
		int a;
		a = 5;
		double e;
		e = 16;
		float d;
		d = 6.4f;
		long j;
		j = 99L;
		char n;
		n = '1';
		boolean m;
		m= false;
		byte pp;
		pp = 56;
		short qq;
		qq = 44;
		
		
		int ab = 1;
		double bb = 3;
		float cb = 5.3f;
		long db = 3L;
		char eb = '웅';
		boolean fb = true;
		byte gb = 3;
		short hb = 4;
		
		x = 20; //기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
		
		a= 10;
		e= 20;
		d= 2.4f;
		j= 100L;
		n= '힛';
		m= true;
		pp = 33;
		qq = 22;
		
		ab= 5;
		bb= 10;
		cb= 1.1f;
		db= 5L;
		eb= '비';
		fb= false;
		gb= 4;
		hb= 5;

		//위에서 만든 8개 변수 값 출력
		System.out.println(ab);
		System.out.println(bb);
		System.out.println(cb);
		System.out.println(db);
		System.out.println(eb);
		System.out.println(fb);
		System.out.println(gb);
		System.out.println(hb);
		
		//문자열
		String str = "문자 여러개"; //클래스는 참조형타입
			//앞글자가 대문자: 클래스 이름
		System.out.println(str);
		
		//문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻음.
		System.out.println(str+50);
		/*
		 * ex.System.out.println(str+50); 
		 * 	위와같이 타입이 다른 경우(문자+숫자)
		 * 연산자가 같아야하기에 
		 * 50이라는 숫자가 문자열로 바뀌며 연산이 됨. 
		 */
		System.out.println(10+20+str);
		System.out.println(10+str+20);
		System.out.println(str+10+20);
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값을 타입을 변경해야하는데 이를 형변환(type casting)이라 한다.
		
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략가능
		
		/*
		 * 명명규칙
		 * -영문자 대소문자,한글,숫자,특수문자('_','$')를 사용할 수 있다.
		 * -숫자로 시작할 수 없다.
		 * -예약어는 사용할 수 없다.
		 * -[낙타식 표기법을 사용한다. (mySampleVariable)
		 * -[클래스명의 첫글자는 대문자로 한다.(MySampleClass)
		 */
	
		/*
		 * 상수
		 * -값을 변경 할 수 없는 그릇
		 * -리터럴에 의미를 부여하기 위해 사용한다.
		 * -상수는 이름을 지을 경우 알파벳 대문자만 사용한다.
		 * -상수는 값을 변경할 수 없다
		 */
		
		final int MAX_NUMBER = 10;
		// MAX_NUMBER = 20; -> 컴파일 에러 발생		
		
		
		System.out.print("줄바꿈을 하지 않는다 바로 옆에");
		System.out.println("줄바꿈을 한다");
		System.out.printf("문자열: %s, 숫자: %d\n", str, x );
		//출력 포맷을 지정한다.
		
		//System.out.printf("문자열: %s, 숫자: %d", str, x);
		//str-문자열 %s // 숫자-%d printf도 줄바꿈을 하기 위해 \n 입력
	
	/*
	 *\n: 줄바꿈
	 *\t: 탭
	 */
				
		//입력 - 
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		//Scanner 선언 시 같은 패키지 안에 클래스 경로좀 알려줘!
		
		// System.out.print("아무거나 입력해주세요");
		//sc.nextLine(); //프로그램이 멈추고 사용자가 입력할 때까지 기다림
		//nextline은 string타입 변수다.
		//String str2 = sc.nextLine();
		//System.out.println(str2);
		//문자열 입력
		
		
		/*
		 * int.nextInt = sc.nextInt();
		 * 	double nextDouble = sc.nextDouble();
		 */
		
		//System.out.println("int 입력>");
		//int nextInt = sc.nextInt();
		//System.out.println(nextInt);
		//System.out.println("문자열 입력>");
		//System nextLine = sc.nextLine();
		//System.out.println(nextLine);
		//System.out.println("입력 끝!");

		/*System.out.print("int 입력>");
		int number = Integer.parseInt(sc.nextLine()); //string타입의 int로 형변환
		double nuber = Double.parseDouble(sc.nextLine()); //string타입을 double로 형변환
		System.out.println(number);*/
		
		
		
		
		//1. 자신의 이름 저장할 변수 선언
		
		String myName;
		//변수의 이름 소문자, 두단어 이상이면 대문자
		
		//1-1. 위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아라.
		
		System.out.println("\n이름입력");
		
		//string myName 할필요 x
		//string myNmae2 로 새로운 저장소만들필요 x
		myName = sc.nextLine();
		
		System.out.println(myName);
		
		//2.자신의 나이를 저장할 변수 선언
		int myAge;
		//2-1.선언변수 초기화 위해 나이 입력받아줘
		System.out.println("\n나이입력");
		myAge = Integer.parseInt(sc.nextLine());
		System.out.println(myAge);
		
		System.out.println("\n결과 엔터");
		
		sc.nextLine();
		System.out.println("이름: " + myName + "/나이: "+myAge);
		
		
		/*다음과 같은 프로그램을 작성해주세요.
		
		
		
	    ======회원가입=======
		아이디 > admin
		비밀번호(4자리숫자):1234
		이름>홍길동
		나이>30세
		키>185.5
		===========================
		회원가입 완료!!
		
		==========내 정보============
		아이디 : admin
		비밀번호 :1234
		이름: 홍길동
		나이: 30세
		키: 185.5cm
		
		*/
		
		
		sc.close();
	
	}

}
	

