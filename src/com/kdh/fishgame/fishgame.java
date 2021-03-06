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
        //물고기 위치 랜덤으로 정하기
        for(int i=0; i<3; i++){ 
            // 물고기 위치가 중복이면 다시 정하기
            while(true){
                fishplace1 = rand.nextInt(5);
                fishplace2 = rand.nextInt(5);
                if(arr[fishplace1][fishplace2] == 1)
                    continue;
                if(!(fishplace1 == f1 && fishplace2 == f2))
                    break;
            }
            //값 다른 위치에 저장
            f1 = fishplace1;
            f2 = fishplace2;
            arr[f1][f2] = 1;
        }
        System.out.print("던질위치 입력 : ");
        int location1 = sc.nextInt();
        int location2 = sc.nextInt();
        //던지는 위치 범위 벗어나면 다시 입력
        while(true){
            if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4){
                System.out.println("범위를 넘어갔습니다 다시 입력하세요");
                System.out.print("던질위치 입력 : ");
                location1 = sc.nextInt();
                location2 = sc.nextInt();
            }break;
        }
        //낚시 위치 표시 값 지정
        arr[location1][location2] = 2;
        System.out.println("방향 입력(1.위 2.아래 3.왼쪽 4. 오른쪽) : ");
        while(true){
            // 위치 표시
            for(f1=0; f1<5; f1++){
                for(f2=0; f2<5; f2++){
                    if(arr[f1][f2] == 0)
                        System.out.print(" □ ");//물고기가 없는위치
                    else if(arr[f1][f2] == 1)
                        System.out.print(" ■ ");//물고기가 있는위치
                    else{
                        System.out.print(" ↓ ");//낚시를 하는위치
                        arr[location1][location2] = 0;
                    }
                }
                System.out.println();
            }
            System.out.print("방향 입력 : ");
            int dr = sc.nextInt();
            //1,2,3,4 다른값 이면 다시 입력(잘못입력 방지)
            while(dr > 4 || dr < 0){
                System.out.print("다시입력 : ");
                dr = sc.nextInt();
            }
            switch (dr) {
                case 1: location1 -=1;
                if(location1 < 0){
                    location1 = 0;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 2: location1 +=1;
                    if(location1 > 4){
                        location1 = 4;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 3: location2 -=1;
                    if(location2 < 0){
                        location2 = 0;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 4: location2 +=1;
                    if(location2 > 4){
                        location2 = 4;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
            }
            arr[location1][location2] = 2;
            // 물고기 몇마리 남은지 계산
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(arr[i][j] == 1)
                        count ++;
                }
            }
            System.out.printf("남은 물고기 : %d\n", count);
            //물고기를 다 잡으면 프로그램 종료
            if(count == 0){
                System.out.println("물고기를 다 잡았습니다.");
                System.out.println("프로그램 종료");
                break;
            }
            //남은 물고기가 더이상 중첩되지 않도록 0으로 초기화
            count = 0;
        }
        sc.close();
    }
}