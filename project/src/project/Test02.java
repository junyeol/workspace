package project;

public class Test02 {

	public static void main(String[] args) {

		// 이런 상황들때문에 우리는 "배열"을 사용한다!
		
		int stu1=10;
		int stu2=94;
		int stu3=87;
		// 메모리를 서로 옆에둘 필요성을 모름...
		
		int[] student=new int[3];
		// 각 메모리 공간을 [index]를 붙여서 관리!
		student[0]=10;
		student[1]=94;
		student[2]=87;
		

		for(int i=0;i<3;i++) {
			System.out.println("학생 "+(i+1)+"번의 점수는 "+student[i]+"점입니다.");	
		}
		
		
		
		
		
		
		
		





	}

}
