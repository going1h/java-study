package com.kdh.javastudy03;

import java.util.Random;
import java.util.Scanner;

public class javastudy03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	//	[����11]2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ�
	//    ����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ�
	//    ����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ 
	//    "������error"����Ͻÿ�
	//
	//	[������]
	//	A���� �Է��Ͻÿ�: 25
	//	B���� �Է��Ͻÿ�: 36
	//	�����ڸ� �Է�(+,-,*,/) : +
	//	25 + 36 = xx
	//	
	//	A���� �Է��Ͻÿ�: 25
	//	B���� �Է��Ͻÿ�: 36
	//	�����ڸ� �Է�(+,-,*,/) : /
	//	25 / 36 = xx.xxxxx      
	//	
	//	A���� �Է��Ͻÿ�: 25
	//	B���� �Է��Ͻÿ�: 36
	//	�����ڸ� �Է�(+,-,*,/) : #
	//	������ error
			
		System.out.print("A���� �Է��Ͻÿ� : ");
		int a11 = sc.nextInt();
		System.out.print("B���� �Է��Ͻÿ� : ");
		int b11 = sc.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ�(ex:+,-,*,/) : ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11+b11);
			break;
		case '-': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11-b11);
			break;
		case '*': System.out.printf("%d %c %d = %d\n",a11,op,b11,a11*b11);
			break;
		case '/': System.out.printf("%d %c %d = %.2f\n",a11,op,b11,(double)a11/b11);
		default: System.out.println("������ error");
			break;
		}
		System.out.print("------------------");
		System.out.println();
	
	//	[����12]����ó�����α׷�
	//        
	//	--����� ȭ��--
	//
	//	�߰���縦 �Է��Ͻÿ� : 90
	//	�⸻��縦 �Է��Ͻÿ� : 89
	//	����Ʈ��縦 �Է��Ͻÿ� : 99
	//	�⼮��縦 �Է��Ͻÿ� : 100
	//
	//	�߰���� : 90
	//	�⸻��� : 89
	//	����Ʈ : 99
	//	�⼮ : 100
	//
	//	����=93.20      <---�Ҽ����� 2°�ڸ�����
	//	����=A              System.out.printf("���� : %.2f", avg);
	//	��=excellent
	//
	//	����1) (�߰�+�⸻)/2      ---> 60%
	//	����Ʈ             ---> 20%
	//	�⼮               ---> 20%
	//		     
	//	����2)  90�̻� 'A'����     (3)A,B����  ---->"excellent"
	//	80�̻� 'B'����        C,D����  ---->"good"
	//	70�̻� 'C'����        F����    ---->"poor"
	//	60�̻� 'D'����        (switch���̿�) 
	//	������ 'F'����
	//	(if~else if���̿�)
		
		char grade;
		String add = null;
		
		System.out.print("�߰���縦 ������ �Է��Ͻÿ� : ");
		int jumsu1 = sc.nextInt();
		System.out.print("�⸻��縦 ������ �Է��Ͻÿ� : ");
		int jumsu2 = sc.nextInt();
		System.out.print("����Ʈ ������ �Է��Ͻÿ� : ");
		int report = sc.nextInt();
		System.out.print("�⼮ ������ �Է��Ͻÿ� : ");
		int attend = sc.nextInt();
		
		System.out.println("�߰���� : " + jumsu1 + "��");
		System.out.println("�⸻��� : " + jumsu2 + "��");
		System.out.println("����Ʈ : " + report + "��");
		System.out.println("�⼮ : " + attend + "��");
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
		
		System.out.printf("���� : %.2f\n",score);
		System.out.println("���� : " + grade);
		System.out.println("�� : " + add);
		
		System.out.print("------------------");
		System.out.println();
		
	//	[����13]�⵵�� �Է¹޾� ����/��� ���ϱ�
	//	(����)��,�� �������� �� �����ؾ� ������
	//	��⵵�� 4�� ������ �������� ��
	//	��⵵�� 100���γ����� �������� �ʰų�
	//	�⵵�� 400���� ������ �������� ��
	//	(����) 4(����), 100(���), 400(����)�� 
	//
	//	--���--
	//	�⵵ �Է� : 2000
	//	����
	//
	//	�⵵ �Է� : 2001
	//	���
	//
	//	�⵵ �Է� : 2004
	//	����
	
		System.out.print("�⵵ �Է� : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + "���� ���� �Դϴ�.");
		} else {
			System.out.println(year + "���� ��� �Դϴ�.");
		}
		System.out.print("------------------");
		System.out.println();
	
	
	//	[����14] 50���� ������ ���� ������ ���� ����Ͻÿ�
	//    ����1) 0 - 100 ������ �� �ϰ�
	//    ����2) 1�ٿ� 6���� ǥ���Ͻÿ�  
	//
	//	--���--
	//	12      72      74      0       20      89
	//	84      83      53      0       95      53
	//	68      55      89      6       20      68
	//	17      9       75      56      17      85
	//	62      33      7       34      85      28
	//	28      55      95      31      69      22
	//	30      92      1       16      88      80
	//	64      55      71      12      29      72
	//	20      41
	//	��=2420
	
		int num14;
		int sum14 = 0;
	
		for(int i=1; i<=50; i++) {
			num14 = new Random().nextInt(101);
			System.out.print(num14 + "\t");
			sum14 += num14;
			if(i % 6 == 0)
				System.out.println();
		}
		System.out.println("\n�� = " + sum14);
		
		System.out.print("------------------");
		System.out.println();
		
//		[����15] 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�
//      �����߻�)1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
//             2. �� import java.util.Random;
//             �� Random ����1 = new Random();
//             �� int ����2 = ����1.nextInt(�ִ밪); 
//             ==>  0 ~ (�ִ밪 - 1)������ ������ ��
//
//		[������]
//		
//		*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** 
//		
//		���� �Է� : 50
//		��ǻ���� ���ڰ� �� Ů�ϴ�..
//		
//		���� �Է� : 90
//		��ǻ���� ���ڰ� �� �۽��ϴ�..
//		
//		         :
//		
//		���� �Է� : 83
//		��ī��ī...xx������ ���߼̽��ϴ�...
		
		int a = (int)(Math.random()*100);
		int num, cnt = 0;
		
		while(true) {
			System.out.print("�����Է� : ");	num = sc.nextInt();
			cnt++;
			if(num>a)
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�.\n");
			else if(num<a)
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�.\n");
			else
				break;
		}
		System.out.println("��ī��ī~! " + cnt + "������ ���߼̽��ϴ�.");
		
	}
}
