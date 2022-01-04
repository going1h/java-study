package com.kdh.fishgame;

import java.util.Random;
import java.util.Scanner;

public class fishgame {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int fishplace1 = rand.nextInt(5);
        int fishplace2 = rand.nextInt(5);
        int f1=0, f2=0, count=0;
        //����� ��ġ �������� ���ϱ�
        for(int i=0; i<3; i++){ 
            // ����� ��ġ�� �ߺ��̸� �ٽ� ���ϱ�
            while(true){
                fishplace1 = rand.nextInt(5);
                fishplace2 = rand.nextInt(5);
                if(arr[fishplace1][fishplace2] == 1)
                    continue;
                if(!(fishplace1 == f1 && fishplace2 == f2))
                    break;
            }
            //�� �ٸ� ��ġ�� ����
            f1 = fishplace1;
            f2 = fishplace2;
            arr[f1][f2] = 1;
        }
        System.out.print("������ġ �Է� : ");
        int location1 = sc.nextInt();
        int location2 = sc.nextInt();
        //������ ��ġ ���� ����� �ٽ� �Է�
        while(true){
            if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4){
                System.out.println("������ �Ѿ���ϴ� �ٽ� �Է��ϼ���");
                System.out.print("������ġ �Է� : ");
                location1 = sc.nextInt();
                location2 = sc.nextInt();
            }break;
        }
        //���� ��ġ ǥ�� �� ����
        arr[location1][location2] = 2;
        System.out.println("���� �Է�(1.�� 2.�Ʒ� 3.���� 4. ������) : ");
        while(true){
            // ��ġ ǥ��
            for(f1=0; f1<5; f1++){
                for(f2=0; f2<5; f2++){
                    if(arr[f1][f2] == 0)
                        System.out.print(" �� ");//����Ⱑ ������ġ
                    else if(arr[f1][f2] == 1)
                        System.out.print(" �� ");//����Ⱑ �ִ���ġ
                    else{
                        System.out.print(" �� ");//���ø� �ϴ���ġ
                        arr[location1][location2] = 0;
                    }
                }
                System.out.println();
            }
            System.out.print("���� �Է� : ");
            int dr = sc.nextInt();
            //1,2,3,4 �ٸ��� �̸� �ٽ� �Է�(�߸��Է� ����)
            while(dr > 4 || dr < 0){
                System.out.print("�ٽ��Է� : ");
                dr = sc.nextInt();
            }
            switch (dr) {
                case 1: location1 -=1;
                if(location1 < 0){
                    location1 = 0;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 2: location1 +=1;
                    if(location1 > 4){
                        location1 = 4;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 3: location2 -=1;
                    if(location2 < 0){
                        location2 = 0;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 4: location2 +=1;
                    if(location2 > 4){
                        location2 = 4;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
            }
            arr[location1][location2] = 2;
            // ����� ��� ������ ���
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(arr[i][j] == 1)
                        count ++;
                }
            }
            System.out.printf("���� ����� : %d\n", count);
            //����⸦ �� ������ ���α׷� ����
            if(count == 0){
                System.out.println("����⸦ �� ��ҽ��ϴ�.");
                System.out.println("���α׷� ����");
                break;
            }
            //���� ����Ⱑ ���̻� ��ø���� �ʵ��� 0���� �ʱ�ȭ
            count = 0;
        }
        sc.close();
    }
}