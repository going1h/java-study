package com.kdh.javastudy;

import java.util.*;

public class javastudy {
	
	public static void main(String args[]) {
		
	// ���ڿ� ����ȯ
	System.out.println("1. ���ڿ� ����ȯ");
	String a = "100";
	String b = "200";
	
	System.out.println(a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)));
	System.out.println("--------------------");

	//ȭ�� ���� ���ϱ�
	System.out.println("2. ȭ�� ���� ���ϱ�");
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
	System.out.println("���� = " + a1+"��");
	System.out.println("õ�� = " + b1+"��");
	System.out.println("��� = " + c1+"��");
	System.out.println("�ʿ� = " + d1+"��");
	System.out.println("--------------------");
	
	// �޿� ������ �ۼ��Ͻÿ�.
	// ���� 1) �⺻���� 1500000��, ������ 55,000��, ������ �⺻���� 10%
	// ���� 2) �Ǽ��ɾ� = �⺻�� + ���� - ����
	System.out.println("3. �޿� ������ �ۼ��Ͻÿ�");
	int pay = 1500000;
	int timepay = 55000;
	double tax = 0.1;
	int resultpay = pay + timepay - (int)(pay * tax);
	
	System.out.println("�Ǽ��ɾ� : " + resultpay +"��");
	System.out.println("--------------------");
	
	// ���������� �����Ͽ� ����Ͻÿ�
    // ����1) data�� ��ȿ��, ���ߺ�, �븮, 1500000�� ����
	// �������� ����  name,department,position,sal�� �Ұ�
	// ����2)����� �Ʒ��� ���� �޼���(�Լ�)�� �̿��Ͻÿ�

	//	--���--
	//	�̸� : ��ȿ��     ---> println
	//	�μ� : ���ߺ�     ---> printf  
	//	���� : �븮       ---> print 1�����Ἥ ����,�޿����
	//	�޿� : 1500000��
	
	System.out.println("4. ���������� �����Ͽ� ����Ͻÿ�");
	String name = "��ȿ��";
	String department = "���ߺ�";
	String position = "�븮";
	int sal = 1500000;
	
	System.out.println("�̸� : " + name);
	System.out.printf("�μ� : %s\n", department);
	System.out.print("���� : " + position + "\n�޿� : " + sal + "��" + "\n");
	System.out.println("--------------------");
	
	//	������ �Է¹޾� ����Ͻÿ�
	//
	//	--�Է�--
	//	Input name : �ε鷡
	//	kor : 90 
	//	eng : 70 
	//	mat : 75
	//
	//	--���--
	//	�̸� : �ε鷡
	//	�հ����� : 235��
	//	������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�
	
	System.out.println("5. �Է¹޾� ����ϱ�");
	Scanner sc = new Scanner(System.in);
		
	System.out.print("�̸��� �Է� �Ͻÿ� : ");
	String name5 = sc.next();
	System.out.print("���� ������ �Է� �Ͻÿ� : ");
	int kor = sc.nextInt();
	System.out.print("���� ������ �Է� �Ͻÿ� : ");
	int eng = sc.nextInt();
	System.out.print("���� ������ �Է� �Ͻÿ� : ");
	int mat = sc.nextInt();
	
	int sum = kor + eng + mat;
	double avg = (double)sum / 3;
	System.out.println("Input name : " + name5);
	System.err.println("�հ����� : " + sum + "��");
	System.err.printf("������� : %.1f", avg , "��");
	}
}
