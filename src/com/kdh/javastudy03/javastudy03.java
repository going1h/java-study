package com.kdh.javastudy03;

import java.util.Random;
import java.util.Scanner;

public class javastudy03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	//	[문제11]2개의 숫자와 연산자를 입력하여 계산하시오
	//    조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
	//    조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
	//    "연산자error"출력하시오
	//
	//	[실행결과]
	//	A값을 입력하시오: 25
	//	B값을 입력하시오: 36
	//	연산자를 입력(+,-,*,/) : +
	//	25 + 36 = xx
	//	
	//	A값을 입력하시오: 25
	//	B값을 입력하시오: 36
	//	연산자를 입력(+,-,*,/) : /
	//	25 / 36 = xx.xxxxx      
	//	
	//	A값을 입력하시오: 25
	//	B값을 입력하시오: 36
	//	연산자를 입력(+,-,*,/) : #
	//	연산자 error
			
		System.out.print("A값을 입력하시오 : ");
		int a11 = sc.nextInt();
		System.out.print("B값을 입력하시오 : ");
		int b11 = sc.nextInt();
		System.out.print("연산자를 입력하시오(ex:+,-,*,/) : ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11+b11);
			break;
		case '-': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11-b11);
			break;
		case '*': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11*b11);
			break;
		case '/': System.out.printf("%d %c %d = %.2f\n",a11,op,b11,(double)a11/b11);
		default: System.out.println("연산자 error");
			break;
		}
		System.out.print("------------------");
		System.out.println();
	
	//	[문제12]성적처리프로그램
	//        
	//	--입출력 화면--
	//
	//	중간고사를 입력하시오 : 90
	//	기말고사를 입력하시오 : 89
	//	레포트고사를 입력하시오 : 99
	//	출석고사를 입력하시오 : 100
	//
	//	중간고사 : 90
	//	기말고사 : 89
	//	레포트 : 99
	//	출석 : 100
	//
	//	성적=93.20      <---소수이하 2째자리까지
	//	학점=A              System.out.printf("성적 : %.2f", avg);
	//	평가=excellent
	//
	//	조건1) (중간+기말)/2      ---> 60%
	//	레포트             ---> 20%
	//	출석               ---> 20%
	//		     
	//	조건2)  90이상 'A'학점     (3)A,B학점  ---->"excellent"
	//	80이상 'B'학점        C,D학점  ---->"good"
	//	70이상 'C'학점        F학점    ---->"poor"
	//	60이상 'D'학점        (switch문이용) 
	//	나머지 'F'학점
	//	(if~else if문이용)
		
		char grade;
		String add = null;
		
		System.out.print("중간고사를 점수를 입력하시오 : ");
		int jumsu1 = sc.nextInt();
		System.out.print("기말고사를 점수를 입력하시오 : ");
		int jumsu2 = sc.nextInt();
		System.out.print("레포트 점수를 입력하시오 : ");
		int report = sc.nextInt();
		System.out.print("출석 점수를 입력하시오 : ");
		int attend = sc.nextInt();
		
		System.out.println("중간고사 : " + jumsu1 + "점");
		System.out.println("기말고사 : " + jumsu2 + "점");
		System.out.println("레포트 : " + report + "점");
		System.out.println("출석 : " + attend + "점");
		System.out.println();
		
		double score = (double)(jumsu1+jumsu2) / 2 *0.6 + report *0.2 + attend *0.2;
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if ( score >= 70 ) {
			grade = 'C';
		} else if ( score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		switch (grade) {
			case 'A' : add = "excellent";
				break;
			case 'B' : add = "good";
				break;
			case 'C' : add = "poor";
				break;
			case 'D' : add = "bad";
				break;
			case 'F' : add = "very bad";
				break;
		}
		
		System.out.printf("성적 : %.2f\n",score);
		System.out.println("학점 : " + grade);
		System.out.println("평가 : " + add);
		
		System.out.print("------------------");
		System.out.println();
		
	//	[문제13]년도를 입력받아 윤년/평년 구하기
	//	(공식)①,② 두조건을 다 만족해야 윤년임
	//	①년도를 4로 나누어 떨어져야 함
	//	②년도를 100으로나누어 떨어지지 않거나
	//	년도를 400으로 나누어 떨어져야 함
	//	(참고) 4(윤년), 100(평년), 400(윤년)임 
	//
	//	--출력--
	//	년도 입력 : 2000
	//	윤년
	//
	//	년도 입력 : 2001
	//	평년
	//
	//	년도 입력 : 2004
	//	윤년
	
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + "년은 윤년 입니다.");
		} else {
			System.out.println(year + "년은 평년 입니다.");
		}
		System.out.print("------------------");
		System.out.println();
	
	
	//	[문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
	//    조건1) 0 - 100 사이의 수 일것
	//    조건2) 1줄에 6개씩 표시하시오  
	//
	//	--출력--
	//	12      72      74      0       20      89
	//	84      83      53      0       95      53
	//	68      55      89      6       20      68
	//	17      9       75      56      17      85
	//	62      33      7       34      85      28
	//	28      55      95      31      69      22
	//	30      92      1       16      88      80
	//	64      55      71      12      29      72
	//	20      41
	//	합=2420
	
		int num14;
		int sum14 = 0;
	
		for(int i=1; i<=50; i++) {
			num14 = new Random().nextInt(101);
			System.out.print(num14 + "\t");
			sum14 += num14;
			if(i % 6 == 0)
				System.out.println();
		}
		System.out.println("\n합 = " + sum14);
		
		System.out.print("------------------");
		System.out.println();
		
//		[문제15] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
//      난수발생)1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
//             2. ① import java.util.Random;
//             ② Random 변수1 = new Random();
//             ③ int 변수2 = 변수1.nextInt(최대값); 
//             ==>  0 ~ (최대값 - 1)사이의 임의의 수
//
//		[실행결과]
//		
//		*** 난수가 발생하였습니다...맞추어 보세요...*** 
//		
//		숫자 입력 : 50
//		컴퓨터의 숫자가 더 큽니다..
//		
//		숫자 입력 : 90
//		컴퓨터의 숫자가 더 작습니다..
//		
//		         :
//		
//		숫자 입력 : 83
//		추카추카...xx번만에 맞추셨습니다...
		
		int a = (int)(Math.random()*100);
		int num, cnt = 0;
		
		while(true) {
			System.out.print("숫자입력 : ");	num = sc.nextInt();
			cnt++;
			if(num>a)
				System.out.println("컴퓨터의 숫자가 더 작습니다.\n");
			else if(num<a)
				System.out.println("컴퓨터의 숫자가 더 큽니다.\n");
			else
				break;
		}
		System.out.println("추카추카~! " + cnt + "번만에 맞추셨습니다.");
		
	}
}
