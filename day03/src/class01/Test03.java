package class01;

public class Test03 {
	public static void main(String[] args) {
		
		//메모리를 따로 저장
		int stu1=10;
		int stu2=94;
		int stu3=87;
		
		
		int[] student=new int[3];
		//각 메모리 공간을 [index]를 붙여서 관리
	 	student[0]=10;
		student[1]=94;
		student[2]=87;
		
		
		for(int i=0;i<3;i++) {
		System.out.println("학생"+(i+1)+"번의 점수는 "+student[i]+"점입니다.");
		
		}
		
		
		
	}
}
