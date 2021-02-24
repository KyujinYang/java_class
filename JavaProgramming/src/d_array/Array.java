package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열 -여러개의 값을 하나의 변수에 저장해서 사용하는 것이다. -참조형 타입이다. -인덱스(값들의 이름을 정해줌)로 값을
		 * 구분한다. -길이를 변경할 수 없다. -같은 타입의 값만 저장을 할 수 있다.
		 * 
		 * 하나의 값만 저장할 수 있다. 값을 여러개 저장하고 그 주소를 변수에 저장한다. 변수(주소)에 하나의 값만 입력할 수 있다.
		 * 따라서 밖에 따로 공간을 만들어 배열을 저장한다
		 */

		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.[배열은 대괄호 int[] array (o) int
						// array[] o 모두 가능 ]
		// 변수초기화 방법1. 배열길이지정
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다. (배열의 초기화) new int[숫자]: 몇개의
							// '숫자'의 값을 저장할 수 있는 배열

		/*
		 * __메모리(변수 안)_________ |변수= 주소_____________| | (변수 밖) 주소{0(변수에 저장되는
		 * 주소), 0, 0, 0, 0}
		 */
		// 변수초기화 방법2. 배열길이지정하지 않고 실제 저장하고 싶은 값을 집어넣기
		array = new int[] { 1, 2, 3, 4, 5 };
		// 변수초기화 방법3. new int[] 생략. 아래의 방법은 선언과 초기화를 동시에 해야한다.
		// array = {1,2,3,4,5}; - 선언과 초기화 동시에 해야함
		int[] array2 = { 1, 2, 3, 4, 5 };

		// 배열의 값을 읽거나 저장하는 방법
		System.out.println(array[0]); // 인덱스 [숫자] 는 [숫자] 0부터 시작한다
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]); // 주의할 점 - 인덱스가 4번까지있으면 4번까지만 참조해야함
										// 4번을 초과시 인덱스의 범위를 초과했다. 값이 나올 수 없다

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 값을 저장할 때
		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
		}

		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] randoms = new int[10];

		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int) (Math.random() * 100) + 1;

		}

		System.out.println(Arrays.toString(randoms));

		// 배에 저장된 모든 값의 합계와 평균을 구하라

		int sum = 0;
		double avg;

		for (int i = 0; i < randoms.length; i++) {
			sum += randoms[i];

		}
		avg = (double) sum / randoms.length;// 배열의길이
		System.out.println("합계: " + sum + " 평균: " + avg);

		// 배열의 저장된 값들 중 최소값과 최대값을 출력해주세요.

		int max = 0;
		int min = 0;

		for (int i = 0; i < randoms.length; i++) {
			if (randoms[i] < min) {
				min = randoms[i];
			}
			if (max < randoms[i]) {
				max = randoms[i];
			}
		}

		System.out.println("최대값" + max);
		System.out.println("최소값" + min);

		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}

		System.out.println(Arrays.toString(shuffle));

		int[] randoms1 = new int[10];

		for (int i = 0; i < randoms.length; i++) {
			randoms1[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(randoms1));
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int random = (int)(Math.random()*shuffle.length);
		int temp = shuffle[0];
		shuffle[0] = shuffle[random];
		shuffle[random] = temp;
		
		System.out.println(Arrays.toString(shuffle));

		//1~10사이의 랜덤값을 500번발생하고 , 각 숫자가 생성된 횟수를 출력해주세요
		
		int[] counts = new int[10];
		for(int i=0; i<500; i++);{
			int random3 = (int)(Math.random() * 10) +1;
			
			/*if (random ==1) counts[0]++;
			if(random==2) counts[1]++; */
			
			counts[random3 - 1 ]++;
			System.out.println(Arrays.toString(counts));
			
			
			
		}

		int[] mix = new int[11];
		for(int i=0; i <mix.length; i++){
			mix[i]=(int)(Math.random()*10);
			System.out.print(mix[i]+",");
		}System.out.println();
	
			int[] count = new int[11];
			
			for(int i = 0; i<mix.length; i++){
				count[mix[i]]++;
				
			}
			for(int i=0; i<count.length;i++){
				System.out.println(i +"번: " + count[i]);
			}
		}
	
	

			}
		
	



// 배열 초기화시 기본값이 저장된다.
/*
 * 기본값 - byte, short, int, long 의 경우는 : 0이 기본값 - float, double: 0.0 - char :
 * 0(' ') - boolean: false - 참조형타입: null(값이 없다) - 메서드 밖에서 만들 었을 때
 */

