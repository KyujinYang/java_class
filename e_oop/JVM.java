package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM(Java Virtual Machine)
		 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바 프로그램
		 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
		 * - 단점 : 속도가 느리다.
		 * 
		 * JVM 메모리 구조
		 * - Method Area(메서드 영역) : 클래스 멤버가 저장된다.
		 * - Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다.
		 * - Heap : 객체가 저장된다.
		 */
		
		//1. 프로그램 실행시 main(), classVar, classMethod()가 MethodArea에 저장됨
		//2. main()이 호출되어 CallStack에 저장됨
		
		System.out.println(classVar);
		//3. System클래스이 out이 MethodArea에 저장됨
		//4. println()이 호출되어 CallStack에 저장됨
		//5. println()이 classVar를 출력 후 CallStack에서 삭제됨
		
		classMethod();
		//6. classMethod()가 호출되어 CallStack에 저장됨
		//7. classMethod()의 내용을 실행
		//8. classMethod()의 실행이 종료되어 CallStack에서 삭제됨
		
		JVM jvm = new JVM();
		//9. JVM객체가 Heap에 저장됨
		//10. jvm변수가 CallStack에 생성되고, JVM객체의 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
		//11. println()이 호출되어 CallStack에 저장됨
		//12. println()이 instanceVar를 출력 후 CallStack에서 삭제됨
		
		jvm.instanceMethod();
		//13. instanceMethod()가 호출되어 CallStack에 저장됨
		//14. instanceMethod()의 내용을 실행
		//15. instanceMethod()의 실행이 종료되어 CallStack에서 삭제됨
		
		jvm = null;
		//16. jvm변수에 null이 저장됨
		//17. 어디에서도 주소를 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제됨
		
		//18. main()의 실행이 종료되어 CallStack에서 삭제됨
		//19. 프로그램이 종료되고 MethodArea의 데이터가 삭제됨
		
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
//		System.out.println(instanceVar); //아직 메모리에 올라오지 않은 상태
		System.out.println(classVar);
	}

}














