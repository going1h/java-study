package com.kdh.javastudy04;

public class javastudy04 {

	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return (double)a/b;
	}
	
	
	public static void output(int num, char c) {
		for(int i=1; i<=num; i++)
		{
			System.out.print(c + " ");
		}
	}
	
	public static void main(String[] args) {
		
//	[문제18]다중for이용해서 모양을 만드시오
//        1
//       123
//      12345
//     1234567
//    123456789
//     1234567
//      12345
//       123
//        1
//             
//
//       *
//      * *
//     *   *
//      * *
//       *  
//
//    **********
//    *        *
//    *        *
//    *        *
//    **********    

		int k;
		
		for(int i=-4; i<=4; i++) {
			k=i<0 ? -i : i;
			for(int j=k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=9-2*k; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=-2; i<=2; i++) {
			k=i<0 ? -i : i;
			for(int j=k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=5-2*k; j++) {
				if(j==1 || j==5-2*k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i==1 || i==5)
					System.out.print("*");
				else {
					if(j==1 || j==10)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.print("------------------");
		System.out.println();

//	[문제19] main()함수에서 각각 호출하고 계산된 결과를 return 받아서 main()에서 출력하시오
//			호출함수 :  sum(3,5) 
//			                sub(7,2) 
//			                mul(4,5) 
//			                div(7,3)
//
//
//			더하기 : 8
//			빼  기 : 5
//			곱하기 : 20
//			나누기 : 2.33
	


		System.out.println("더하기 : " + sum(3, 5));
		System.out.println("빼  기 : " + sub(7, 2));
		System.out.println("곱하기 : " + mul(4, 5));
		System.out.printf("나누기 : %.2f\n", div(7, 3));
		
		System.out.print("------------------");
		System.out.println();
		
	
//	[문제20] output(10,'#')함수를 호출하여 다음과 같이 출력하시오
//    조건)출력문에서 for문을 이용하시오
//
//	<결과>
//	# # # # # # # # # # 
		
		
		output(10, '#');
		
		
	}
}
