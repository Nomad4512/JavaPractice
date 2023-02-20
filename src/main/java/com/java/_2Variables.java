package com.java;

public class _2Variables {
    public static void main(String[] args) {

        int score; // 변수 선언
        score = 90; // 값 저장 -> 대입연산자 '=' 사용. 최초로 값이 저장 될 때 변수 초기화.
        System.out.println(score);
        /*
        int value;

        int result = value + 10;

        System.out.println(result);
            -> value 변수를 초기화하지 않았기때문에 에러 발생!
         */

        // 2. 변수 사용
        int hour = 5;
        int minute = 10;
        System.out.println("현재 시간은 "+hour+"시 "+minute+"분입니다.");
        int totalMin = hour*60+minute;
        System.out.println("대전까지 가는데는 총 "+totalMin+"분이 걸립니다.");

        // 3. 변수값 교환
        int x = 1; int y = 3;
        System.out.println("x = "+x+", y = "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = "+x+", y = "+y);

        class range{
            int z = 3;
        }
        // System.out.println("x+y+z = "+x+y+z); -> z 때문에 컴파일 에러 발생.
        // 로컬 변수는 자신이 선언된 위치로부터 속한 블록 내부에서만 사용할 수 있다.

    }
}
