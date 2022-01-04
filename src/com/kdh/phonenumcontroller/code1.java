package com.kdh.phonenumcontroller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class PhoneNumber{
	String number;
}

class PhoneNumberController{
	//1. ��ȭ��ȣ �߰�
	void addPhoneNumber(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String number = sc.next();
		boolean nameCheck = checkName(h, name);
		boolean numberCheck = checkNumber(h, number); 
		//�̸��� ������ true
		if(nameCheck && numberCheck)
		{
			PhoneNumber p = new PhoneNumber();
			p.number = number;
			h.put(name, p);
			System.out.println(name+"���� ��ȭ��ȣ�� �߰� �Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("���� ��ȭ��ȣ �Ǵ� ���� �̸��� �ֽ��ϴ�.");
		}
	}
	//2. ��ȭ��ȣ ����
	void removePhoneNumber(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = sc.next();
		//�̸��� �־�� true
		//fasle 
		if(!checkName(h, name))
		{
			h.remove(name);
			System.out.println(name+"���� ��ȭ��ȣ�� ���� �Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("��ȭ��ȣ�� �̸��� �����ϴ�.");
		}
		
	}
	//3. ��ȭ��ȣ ��ü���
	void allPrint(HashMap<String, PhoneNumber> h)
	{
		Set<String>keys = h.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext())
		{
			String name = it.next();
			PhoneNumber temp = h.get(name);
			System.out.println("�̸� : "+ name+", ��ȭ��ȣ : "+temp.number);
		}
	}
	//4. ��ȭ��ȣ �˻����
	void serchPrint(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = sc.next();
		//�̸��� ������ true
		if(!checkName(h, name))
		{
			System.out.println("�̸� : "+ name+", ��ȭ��ȣ : "+h.get(name).number);
		}
		else
		{
			System.out.println("�˻��ϴ� �̸��� �����ϴ�.");
		}
	}
	//5. ùȭ�� ���
	void firstPrint()
	{
		System.out.print("1. ��ȭ��ȣ ���� 2. ��ȭ��ȣ ���� 3. ��ȭ��ȣ ��ü ��� 4. ��ȭ��ȣ �˻� ��� 5. ���� : ");
	}
	//6. ��ȣ �ߺ����� �˻�
	boolean checkNumber(HashMap<String, PhoneNumber> h, String number)
	{
		Set<String>keys = h.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext())
		{
			String name = it.next();
			PhoneNumber temp = h.get(name);
			if(temp.number.equals(number))
				return false;
		}
		//������� ���Խ��ϴ�.
		return true;
	}
	//7. �̸� ���� Ȯ��
	boolean checkName(HashMap<String, PhoneNumber> h, String name)
	{
		//map ȫ�浿 name ������
		Set<String>keys = h.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext())
		{
			String temp = it.next();
			if(temp.equals(name))
				return false;
		}
		return true;
	}
}


public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, PhoneNumber> map = new HashMap<>();
		PhoneNumberController pc = new PhoneNumberController();
		Scanner sc = new Scanner(System.in);
		boolean check =true;
		while(check)
		{
			pc.firstPrint();
			int select = sc.nextInt();
			switch (select) {
			case 1: 
				pc.addPhoneNumber(map);
				break;
			case 2:
				pc.removePhoneNumber(map);
				break;
			case 3:
				pc.allPrint(map);
				break;
			case 4:
				pc.serchPrint(map);
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				check = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
			
		}


	}

}
