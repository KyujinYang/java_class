package e_oop.phone;

public class PhoneBook_404 {
 private String names; // 이름
 private String number; // 번호

//1.주소록 생성자만들기
	PhoneBook_404(String name, String number) {
		this.names = name;
		this.number = number;
	}	

//2.메서드만들기 - 문자열로 리턴해주는 메서드
	public String PhoneBookInfo_404() {
		String info = "이름: "+ names;
		info += " 전화번호: " + number;
	
	return info; 
	

	}
//3.name리턴
	public String getNames(){
		return this.names;
	}
//4.number리턴
	public String getNumber(){
		return this.number;
	}
}

