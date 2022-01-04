package com.kdh.phonenumcontroller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class PhoneNumber{
	String number;
}

class PhoneNumberController{
	//1. 전화번호 추가
	void addPhoneNumber(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String number = sc.next();
		boolean nameCheck = checkName(h, name);
		boolean numberCheck = checkNumber(h, number); 
		//이름이 없으면 true
		if(nameCheck && numberCheck)
		{
			PhoneNumber p = new PhoneNumber();
			p.number = number;
			h.put(name, p);
			System.out.println(name+"님의 전화번호가 추가 되었습니다.");
		}
		else
		{
			System.out.println("같은 전화번호 또는 같은 이름이 있습니다.");
		}
	}
	//2. 전화번호 삭제
	void removePhoneNumber(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		//이름이 있어야 true
		//fasle 
		if(!checkName(h, name))
		{
			h.remove(name);
			System.out.println(name+"님의 전화번호가 삭제 되었습니다.");
		}
		else
		{
			System.out.println("전화번호에 이름이 없습니다.");
		}
		
	}
	//3. 전화번호 전체출력
	void allPrint(HashMap<String, PhoneNumber> h)
	{
		Set<String>keys = h.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext())
		{
			String name = it.next();
			PhoneNumber temp = h.get(name);
			System.out.println("이름 : "+ name+", 전화번호 : "+temp.number);
		}
	}
	//4. 전화번호 검색출력
	void serchPrint(HashMap<String, PhoneNumber> h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		//이름이 있으면 true
		if(!checkName(h, name))
		{
			System.out.println("이름 : "+ name+", 전화번호 : "+h.get(name).number);
		}
		else
		{
			System.out.println("검색하는 이름이 없습니다.");
		}
	}
	//5. 첫화면 출력
	void firstPrint()
	{
		System.out.print("1. 전화번호 저장 2. 전화번호 삭제 3. 전화번호 전체 출력 4. 전화번호 검색 출력 5. 종료 : ");
	}
	//6. 번호 중복여부 검사
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
		//여기까지 나왔습니다.
		return true;
	}
	//7. 이름 여부 확인
	boolean checkName(HashMap<String, PhoneNumber> h, String name)
	{
		//map 홍길동 name 강아지
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
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}


	}

}
