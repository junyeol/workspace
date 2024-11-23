package cote;

import java.util.Arrays;
import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] datas=new int[N];
		for(int i=0;i<datas.length;i++) {
			datas[i]=sc.nextInt();
		}
		
		int max=Arrays.stream(datas).max().getAsInt();
		int min=Arrays.stream(datas).min().getAsInt();
	
		int res=max-min;
		System.out.println(res);	

		
	}
	
	
	
	//배열이 주어졌을때
	
	//가장 큰 점수를 찾고,
	
	//가장 작은 점수를 찾는다.
	
	//큰수 - 작은 점수 = 정답
	
}
