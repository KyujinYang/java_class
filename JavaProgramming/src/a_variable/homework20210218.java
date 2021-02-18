package a_variable;

	import java.util.Scanner; 

	public class homework20210218 {

	public static void main(String[] args) {
		 /*         ======회원가입=======
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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========회원가입========");
		
		String id;
		System.out.println("\n아이디를 입력하세요");
		id = sc.nextLine();
		
		int password;
		System.out.println("\n비밀번호를 입력하세요");
		password = Integer.parseInt(sc.nextLine());
		
		String name;
		System.out.println("\n이름을 입력하세요");
		name = sc.nextLine();
		
		int age;
		System.out.println("\n나이를 입력하세요");
		age = Integer.parseInt(sc.nextLine());
		
		double height;
		System.out.println("\n키를 입력하세요");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("======================");
		System.out.println("회원가입 완료!!");
		System.out.println("========내 정보========");
		System.out.println("아이디: " + id + "\n비밀번호: " + password + "\n이름 " + name + "\n나이: "+ age + "\n키= " + height);
		
	} 
	
	
}
	