package com.java;

public class _1Main {
    public static void main(String[] args) {

        // 1. Hello world! 출력하기
        System.out.println("Hello world!");

        // 2. 주석 사용하기
             // 라인 주석
            /*
                범위주석
             */
            //* 도큐먼트 주석 : 주로 javadoc 명령어로 API 도큐먼트 생성에 사용 */
        // "문자열 내부에는 // 주석을 사용할 수 없다"

        // 3. 실행문과 세미콜론
        int x;
        x = 1;
        int y = 2;
        int result = x + y;
        System.out.println("x + y = "+result);

        int a = 1; int b = 2; int result2 =

                a + b; // ;까지 하나의 실행문으로 해석. 여러줄에 걸쳐서 실행문 작성해도 된다. 한줄에 여러 실행문 해도 되고.
        System.out.println("a + b = "+result2);


    }
}