package class02;



public class Test03 {
	
	public static void printAvg(int num1, int num2) { //메서드 시그니쳐 부분
		double avg=(num1+num2)/2.0;
		System.out.println("avg="+avg);
		
	}
	
	public static void main(String[] args) {
		printAvg(1,2);
	}
}
