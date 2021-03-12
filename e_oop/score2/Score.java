package e_oop.score2;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].name = "학생" + (i + 1);
			students[i].createRandomScore();
			students[i].getSum();
			students[i].getAverage();
		}
		
		for(int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		
		for(int i = 0; i < students.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < students.length - i - 1; j++){
				if(students[j].getSum() < students[j + 1].getSum()){
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getInfo());
			
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		System.out.print("과목합계");
		for(int i = 0; i < subSum.length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round(subSum[i] / students.length * 100) / 100.0;
			System.out.print("\t" + subAvg[i]);
		}
		System.out.println();
	}

}
