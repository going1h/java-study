package com.kdh.javastudy02;

import java.util.Scanner;

public class javastudy02 {

	public static void main(String []args) {
		//	[����6] ������ �Է¹޾� ����Ͻÿ�
		//  (�ﰢ������ = (�غ� * ����)/2)  
		//
		//  --�Է�--
		//  **** �ﰢ���� ���� ���ϱ�  ****
		//  �غ� :  10  
		//  ���� :   3
		//   
		//  --���--
		//  ���� :   XX.XX  <--- �Ҽ� 2�ڸ���������Ͻÿ�
			
			Scanner sc = new Scanner(System.in);
			int bottom = 0;
			int height = 0;
			
			System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
			System.out.print("�غ� : ");
			bottom = sc.nextInt();
			System.out.print("���� : ");
			height = sc.nextInt();
			
			double area = (bottom * height) / 2;
			System.out.printf("���� : %.2f", area);
			System.out.println("");
			System.out.println("---------------------");
			
			// [����7] �Է¹޾� �μ��� ū���� ����Ͻÿ�
	        // (��, �񱳿����� ���׿����ڸ� �̿��Ͻÿ�)
			// Input a : 5
			// Input b : 13
			
			// ū�� : 13
			System.out.printf("ù��° �� : ");
			int a7 = sc.nextInt();
			System.out.printf("�ι�° �� : ");
			int b7 = sc.nextInt();
			
//			if(a7 > b7) {
//				System.out.print("ù��° �Է¹��� ���ڰ� �� Ů�ϴ�.");
//			} else {
//				System.out.print("�ι�° �Է¹��� ���ڰ� �� Ů�ϴ�");
//			}
			System.out.println("ū �� : " + (a7 > b7 ? a7 : b7));
			System.out.println("---------------------");
			
			// [����8] ���� �Է¹޾� 0���� �۰ų� 100���� ũ�� "�Է¿���!!"  ���
	        // (if���� ||�����ڸ� �̿��Ͻÿ�)
			
			// �����Է� : 120
			// �Է¿���!!
			
			// �����Է� : 55
			// �ԷµȰ� : 55
			
			System.out.printf("���� �Է� : ");
			int num8 =  sc.nextInt();
			
			if(num8 < 0 || num8 > 100) {
				System.out.printf("100������ �Է����ּ���.");
			} else {
				System.out.printf("�Էµ� �� : " + num8);
			}
			System.out.println();
			System.out.println("---------------------");
			
//			[����9] �Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ�
//	        �ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����Ͻÿ�
//	              �׿��� �����̸� "�Էµ���Ÿ����"��� ǥ���Ͻÿ�
//	        (if-else�� �̿�)
//
//			Input Character: A
//			result : a
//			
//			Input Character: a
//			result : A
//			
//			Input Character: *
//			�Էµ����� ����
			
			char ch;
			System.out.printf("Input Character : ");
			ch = sc.next().charAt(0);
			
			if(ch>='A' && ch<='Z') {
				System.out.println("result : " + (char)(ch+32));
			} else if(ch>='a' && ch<='z') {
				System.out.println("result : " + (char)(ch-32));
			} else { 
				System.out.println("�Էµ����� ����");
			}
			System.out.println();
			System.out.println("---------------------");
			
//			[����10] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�
//		    (����) ���� : M �̸� "����", ������ "����" 
//		    (���׿����� �̿�)
//	
//			Input name: ��̶�
//			Input gender: F
//			Input age:  25
//			Input tall: 173.3 
//			
//			--���--
//			�̸� : ��̶�
//			���� : ����
//			���� : 25��
//			���� : 173.3cm  
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
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + (gender == 'M' ? "����" : "����"));
			System.out.println("���� : " + age +"��");
			System.out.printf("���� : %.1f", tall+"cm");
			
		}
	}