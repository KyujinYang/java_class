package e_oop.phone;

import java.util.Scanner;

public class Phone {

	private Scanner scan;
	private boolean power;
	private String number;
	private String message;
	private boolean send;
	private String contacts;

	public Phone() {
		scan = new Scanner(System.in);
		power = false;
		send = false;
	}

	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요. 사물이 가지고 있는 속성을 변수로 만들고, 변수와 관계된 동작들을 메서드로
	 * 만들어주시면 됩니다.
	 */

	// 수화기 들고 통화연결
	// 종료버튼 눌러 통화종료
	// 전화번호 - 있는 사람 전화번호 출력
	// - 없는 사람 null값 출력
	int inputMenu() {
		System.out.println("-------------------------------");
		System.out.println("1.전원  2.전화번호부 3.통화연결 4.문자메시지 ");
		System.out.println("5.일정등록 6.일정보기 0.종료");
		System.out.println("-------------------------------");
		System.out.print("아래 메뉴번호를 입력하세요> ");
		
		int aa  = Integer.parseInt(scan.nextLine());
		return aa;
		
		//return Integer.parseInt(scan.nextLine());
		}

	String inputNumber() {
		if (power) {
			System.out.println("전화번호를 입력해주세요> ");
			this.number = scan.nextLine();
		}
		 return this.number;
	}

	String inputMessage() {
		if (power) {
			System.out.println("상대방 전화번호를 입력해주세요> ");
			this.number = scan.nextLine();
			System.out.println("메세지 내용을 입력하세요> ");
			this.message = scan.nextLine();
			
		}

		return this.message;

	}
	
	String Contacts() {
		if (power) {
			System.out.println("검색하실 분의 이름을 입력해주세요> ");
			this.number = scan.nextLine();
		}
		return this.contacts;
	}

	void onPower() {
		power = !power;
		System.out.println(power ? "전화기 켜짐" : "전화기 꺼짐");
	}

	void offPower() {
		power = false;
		System.out.println("종료되었습니다.");
		System.exit(1);
	}


	boolean validNumber() {
		boolean res = true;
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if (c < 48 || c > 57) { // 숫자가 아닌 경우
				res = false;
				break;
			}
		}
		// 7자리, 11자리, 13자리만 입력
		if (!(number.length() == 7) && (!(number.length() == 11))) {
			res = false;
		}
		return res;
	}

	String input = null;

	boolean validMessage() {
		input = this.message;
		boolean res1 = true;
		if (input == this.message) {
			System.out.println("메시지를 전송할까요?");
			String yn =scan.nextLine() ;
			if(yn.equals("y") || yn.equals("Y")){
			}
		} else {
			res1 = false;
			System.out.println("알 수 없는 내용입니다.");
		}
		return res1;
	}

	
	boolean Comtacts() {
		input = this.message;
		boolean res1 = true;
		if (input == this.message) {
			System.out.println("메시지를 전송할까요?");
			String yn =scan.nextLine() ;
			if(yn.equals("y") || yn.equals("Y")){
			}
		} else {
			res1 = false;
			System.out.println("알 수 없는 내용입니다.");
		}
		return res1;
	}
	public static void main(String[] args) {
		Phone tel = new Phone();
		PhoneBook_404[] b = new PhoneBook_404[25];
		MonthSchedule contacts = new MonthSchedule(30);
		
		while (true) {
			int menu = tel.inputMenu();

			switch (menu) {
			case 0:
				tel.offPower();
				break;
			case 1:
				tel.onPower();
				break;
			case 2:				
				b[0]=	new PhoneBook_404("곽명훈", "01071862266");
				b[1]=	new PhoneBook_404("김나위", "01023854665");
				b[2]=	new PhoneBook_404("김병수", "01063720802");
				b[3]=	new PhoneBook_404("김성현", "01064841200");
				b[4]=	new PhoneBook_404("김영광", "01051629282");
				b[5]=	new PhoneBook_404("김정명", "01065799779");
				b[6]=	new PhoneBook_404("김찬미", "01052642618");
				b[7]=	new PhoneBook_404("김현민", "01072974517");
				b[8]=	new PhoneBook_404("김현성", "01075340816");
				b[9]=	new PhoneBook_404("류창현", "01068481920");
				b[10]=	new PhoneBook_404("맹세희", "01025605189");
				b[11]=	new PhoneBook_404("배병주", "01041655918");
				b[12]=	new PhoneBook_404("설동비", "01055046734");
				b[13]=	new PhoneBook_404("양규진", "01072417633");
				b[14]=	new PhoneBook_404("여지연", "01056716136");
				b[15]=	new PhoneBook_404("오태훈", "01020444980");
				b[16]=	new PhoneBook_404("이기정", "01027244110");
				b[17]=	new PhoneBook_404("이상훈", "01051005020");
				b[18]=	new PhoneBook_404("이재헌", "01045000552");
				b[19]=	new PhoneBook_404("이치우", "01033981523");
				b[20]=	new PhoneBook_404("전민주", "01027197417");
				b[21]=	new PhoneBook_404("조기범", "01055060213");
				b[22]=	new PhoneBook_404("조영현", "01092380387");
				b[23]=	new PhoneBook_404("조항민", "01093420688");
				b[24]=	new PhoneBook_404("최진우", "01037815868");
				System.out.println("전화번호부를 생성했습니다");
				
				break;
			case 3:
				//전화번호 입력하기
				String number1 = tel.inputNumber();///4454545
				
				//입력한 번호가 전화번호부에 있는자 검사 해서 있으면 있는사람에게 연결 
				//없으면 입력한 번호로 직접 연결 
				if (!number1.equals(null)) {
					boolean res = tel.validNumber();
					if (res) {
						boolean bb = false;
						for(int i = 0; i < b.length; i++){
							if(b[i].getNumber().equals(number1)){
								System.out.println(number1+"번호 "+ b[i].getNames()  + "님께 전화합니다.");
								System.out.println("===============통화중===============");
								bb = true;
								break;
							}
						}
						
						if(!bb){
							//전화번호는 맞지만 전화번호부에 등록되지 않은 번호 
							System.out.println("전화번호부에 없는 번호입니다.");
							System.out.println(number1 + "번호로 전화합니다.");
							System.out.println("===============통화중===============");
						}
						
					} else {
						System.out.println("올바른 전화번호를 입력해 주세요.");
					}
				}
				break;
			case 4:
				String message1 = tel.inputMessage();
				if (!message1.equals(null)) {
					  System.out.println("전송할까요?(y/n)");
					  String mess = tel.scan.nextLine();
					  
					  if(mess.equals("y") ||  mess.equals("Y")){
						  System.out.print(message1 + " 를 전송합니다.");
					  }else {
						  System.out.print(message1 + " 전송을 취소합니다.");
					  }	
				} 
				break;
				
			case 5:		
				contacts.input();		
	
				break;

			case 6:
				//System.out.println("일정보기");
				contacts.view();
				break;
				
			default:
				System.out.println("올바른 메뉴번호를 입력해 주세요.");
				break;
			}
		}

	}
}
