package com.kdh.javastudy;

import java.util.*;

public class javastudy {
	
	public static void main(String args[]) {
		
	// 문자열 형변환
	System.out.println("1. 문자열 형변환");
	String a = "100";
	String b = "200";
	
	System.out.println(a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)));
	System.out.println("--------------------");

	//화폐 갯수 구하기
	System.out.println("2. 화폐 갯수 구하기");
	int money = 65430;
	int a1, b1, c1, d1;
	System.out.println("money = " + money);
	a1 = money / 10000;
	money -= a1*10000;
	b1 = money / 1000;
	money -= b1*1000;
	c1 = money / 100;
	money -= c1*100;
	d1 = money / 10;
	money -= d1*10;
	System.out.println("만원 = " + a1+"장");
	System.out.println("천원 = " + b1+"장");
	System.out.println("백원 = " + c1+"개");
	System.out.println("십원 = " + d1+"개");
	System.out.println("--------------------");
	
	// 급여 명세서를 작성하시오.
	// 조건 1) 기본급이 1500000원, 수당이 55,000원, 세금은 기본급의 10%
	// 조건 2) 실수령액 = 기본급 + 수당 - 세금
	System.out.println("3. 급여 명세서를 작성하시오");
	int pay = 1500000;
	int timepay = 55000;
	double tax = 0.1;
	int resultpay = pay + timepay - (int)(pay * tax);
	
	System.out.println("실수령액 : " + resultpay +"원");
	System.out.println("--------------------");
	
	// 각각변수에 대입하여 출력하시오
    // 조건1) data는 이효리, 개발부, 대리, 1500000로 대입
	// 변수명은 각각  name,department,position,sal로 할것
	// 조건2)출력은 아래와 같은 메서드(함수)를 이용하시오

	//	--출력--
	//	이름 : 이효리     ---> println
	//	부서 : 개발부     ---> printf  
	//	직위 : 대리       ---> print 1번만써서 직위,급여출력
	//	급여 : 1500000원
	
	System.out.println("4. 각각변수에 대입하여 출력하시오");
	String name = "이효리";
	String department = "개발부";
	String position = "대리";
	int sal = 1500000;
	
	System.out.println("이름 : " + name);
	System.out.printf("부서 : %s\n", department);
	System.out.print("직급 : " + position + "\n급여 : " + sal + "원" + "\n");
	System.out.println("--------------------");
	
	//	다음을 입력받아 계산하시오
	//
	//	--입력--
	//	Input name : 민들래
	//	kor : 90 
	//	eng : 70 
	//	mat : 75
	//
	//	--출력--
	//	이름 : 민들래
	//	합계점수 : 235점
	//	평균점수 :  78.3   <-- 소수 1자리까지출력하시오
	
	System.out.println("5. 입력받아 계산하기");
	Scanner sc = new Scanner(System.in);
		
	System.out.print("이름을 입력 하시오 : ");
	String name5 = sc.next();
	System.out.print("국어 점수를 입력 하시오 : ");
	int kor = sc.nextInt();
	System.out.print("영어 점수를 입력 하시오 : ");
	int eng = sc.nextInt();
	System.out.print("수학 점수를 입력 하시오 : ");
	int mat = sc.nextInt();
	
	int sum = kor + eng + mat;
	double avg = (double)sum / 3;
	System.out.println("Input name : " + name5);
	System.err.println("합계점수 : " + sum + "점");
	System.err.printf("평균점수 : %.1f", avg , "점");
	}
}
