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
		
//	[����18]����for�̿��ؼ� ����� ����ÿ�
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

//	[����19] main()�Լ����� ���� ȣ���ϰ� ���� ����� return �޾Ƽ� main()���� ����Ͻÿ�
//			ȣ���Լ� :  sum(3,5) 
//			                sub(7,2) 
//			                mul(4,5) 
//			                div(7,3)
//
//
//			���ϱ� : 8
//			��  �� : 5
//			���ϱ� : 20
//			������ : 2.33
	


		System.out.println("���ϱ� : " + sum(3, 5));
		System.out.println("��  �� : " + sub(7, 2));
		System.out.println("���ϱ� : " + mul(4, 5));
		System.out.printf("������ : %.2f\n", div(7, 3));
		
		System.out.print("------------------");
		System.out.println();
		
	
//	[����20] output(10,'#')�Լ��� ȣ���Ͽ� ������ ���� ����Ͻÿ�
//    ����)��¹����� for���� �̿��Ͻÿ�
//
//	<���>
//	# # # # # # # # # # 
		
		
		output(10, '#');
		
		
	}
}
