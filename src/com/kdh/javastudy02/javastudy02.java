package com.kdh.javastudy02;

import java.util.Scanner;

public class javastudy02 {

	public static void main(String []args) {
		//	[문제6] 다음을 입력받아 계산하시오
		//  (삼각형넓이 = (밑변 * 높이)/2)  
		//
		//  --입력--
		//  **** 삼각형의 넓이 구하기  ****
		//  밑변 :  10  
		//  높이 :   3
		//   
		//  --출력--
		//  넓이 :   XX.XX  <--- 소수 2자리까지출력하시오
			
			Scanner sc = new Scanner(System.in);
			int bottom = 0;
			int height = 0;
			
			System.out.println("**** 삼각형의 넓이 구하기 ****");
			System.out.print("밑변 : ");
			bottom = sc.nextInt();
			System.out.print("높이 : ");
			height = sc.nextInt();
			
			double area = (bottom * height) / 2;
			System.out.printf("넓이 : %.2f", area);
			System.out.println("");
			System.out.println("---------------------");
			
			// [문제7] 입력받아 두수중 큰수를 출력하시오
	        // (단, 비교연산은 삼항연산자를 이용하시오)
			// Input a : 5
			// Input b : 13
			
			// 큰수 : 13
			System.out.printf("첫번째 수 : ");
			int a7 = sc.nextInt();
			System.out.printf("두번째 수 : ");
			int b7 = sc.nextInt();
			
//			if(a7 > b7) {
//				System.out.print("첫번째 입력받은 숫자가 더 큽니다.");
//			} else {
//				System.out.print("두번째 입력받은 숫자가 더 큽니다");
//			}
			System.out.println("큰 수 : " + (a7 > b7 ? a7 : b7));
			System.out.println("---------------------");
			
			// [문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
	        // (if문과 ||연산자를 이용하시오)
			
			// 점수입력 : 120
			// 입력오류!!
			
			// 점수입력 : 55
			// 입력된값 : 55
			
			System.out.printf("점수 입력 : ");
			int num8 =  sc.nextInt();
			
			if(num8 < 0 || num8 > 100) {
				System.out.printf("100점까지 입력해주세요.");
			} else {
				System.out.printf("입력된 값 : " + num8);
			}
			System.out.println();
			System.out.println("---------------------");
			
//			[문제9] 입력된 문자가 대문자이면 소문자로 출력하고
//	        소문자이명 대문자로 변환하여 출력하시오
//	              그외의 문자이면 "입력데이타오류"라고 표시하시오
//	        (if-else문 이용)
//
//			Input Character: A
//			result : a
//			
//			Input Character: a
//			result : A
//			
//			Input Character: *
//			입력데이터 오류
			
			char ch;
			System.out.printf("Input Character : ");
			ch = sc.next().charAt(0);
			
			if(ch>='A' && ch<='Z') {
				System.out.println("result : " + (char)(ch+32));
			} else if(ch>='a' && ch<='z') {
				System.out.println("result : " + (char)(ch-32));
			} else { 
				System.out.println("입력데이터 오류");
			}
			System.out.println();
			System.out.println("---------------------");
			
//			[문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
//		    (조건) 성별 : M 이면 "남자", 나머지 "여자" 
//		    (삼항연산자 이용)
//	
//			Input name: 장미란
//			Input gender: F
//			Input age:  25
//			Input tall: 173.3 
//			
//			--결과--
//			이름 : 장미란
//			성별 : 여자
//			나이 : 25세
//			신장 : 173.3cm  
			String name;
			char gender;
			int age;
			double tall;
			System.out.printf("Input name : ");
			name = sc.next();
			System.out.printf("Input gender : ");
			gender = sc.next().charAt(0);
			System.out.printf("Input age : ");
			age = sc.nextInt();
			System.out.printf("Input tall : ");
			tall = sc.nextDouble();
			
			System.out.println("이름 : " + name);
			System.out.println("성별 : " + (gender == 'M' ? "남자" : "여자"));
			System.out.println("나이 : " + age +"세");
			System.out.printf("신장 : %.1f", tall+"cm");
			
		}
	}