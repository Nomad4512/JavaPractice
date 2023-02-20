package com.java;

public class _3Type {
    public static void main(String[] args) {

        // 1. 이스케이프 문자

            String str = "나는 \"자바\"를 좋아합니다."; // 큰 따옴표를 데이터로써 사용하고 싶을때(문자열 식별기호로 X)
            System.out.println(str);

            str = "번호\t이름\t나이";
            System.out.println(str); // \t : 탭만큼 띄우기

            str = "홍길동\n감자바";
            System.out.println(str); // \n : 한 줄 내림

            str = "봄\\여름\\가을\\겨울"; // \\ : \출력
            System.out.println(str);

        // 2. 타입변환

            // 1) 자동형변환
            byte a = 10;
            int b = a; // int>byte 이므로 자동형변환
            System.out.println("b = "+b);

            char c = 'A';
            int d = c ; // char -> int는 유니코드 값이 int에 저장
            System.out.println("d = "+d);

            // 2) 강제형변환
            int e = 10;
            byte f = (byte)e;
            System.out.println("f = "+f);

            int g = 65;
            char h = (char)g;
            System.out.println("h = "+h);

        // 3. 문자열을 기본타입으로 강제 타입 변환
            String str2 = "200";
            int value = Integer.parseInt(str2);
            double dValue = Double.parseDouble(str2);
            System.out.println(value);
            System.out.println(dValue);
            // 반대로는 String.valueOf(type)
            str2 = String.valueOf(h);
            System.out.println(str2);

    }
}
