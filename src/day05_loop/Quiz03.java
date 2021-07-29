package day05_loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 내꺼
		/*
		for(int i=1;i<=100;i++) {
			if(i%6 == 0) {
				System.out.println("6의 배수는 "+i);
			}
		}
		*/
		
		//김성윤
	/*	int j=0;
		for(int i=1; i<=1000; i++) {
			if(i%7 == 0) {
				j+=i;
			}
		}
		System.out.println("7의 배수 합 : "+j);
		*/
		
		// 송지현
	/*	int a=0;
		for(int i=1;i<=500;i++) {
			if(i%3 == 0) {
				a++;
			}
		}System.out.println(a);
		*/
		
		// 신윤수
	/*	Scanner input = new Scanner(System.in);
		int a;
		System.out.println("숫자 입력 : ");
		a = input.nextInt();
		if(a>=1 && a<=100) {
			System.out.print(a+"의 약수 : ");
		}
		
		for(int i=1;i<=a;i++) {
			if(a%i == 0) {
				System.out.print(i);
				if(i != a) {
					System.out.print(", ");
				}
			}
		}  
		*/
		
		//김준호
	/*	int sum=0;
		for(int i=1;i<=100;i+=2) {
				sum += i;
		}
		System.out.println("sum 합계 : "+sum);
			*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
