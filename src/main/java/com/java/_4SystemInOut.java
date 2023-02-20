package com.java;

import java.util.Scanner;

public class _4SystemInOut {
    public static void main(String[] args) throws Exception{

        // 1. printf 메소드 사용
        int value = 123;
        System.out.printf("상품의 가격: %d원\n",value);
        System.out.printf("상품의 가격: %6d원\n",value);
        System.out.printf("상품의 가격: %-6d원\n",value);
        System.out.printf("상품의 가격: %06d원\n",value);

        String name = "홍길동";
        double area = 3.141592;
        System.out.printf("%6d|%-10s|%05.2f\n",1,name,area); // "."도 갯수에 포함

        // 2. System.in.read()
        /*
        int keyCode;
        while(true){
            keyCode = System.in.read();
            System.out.println("keyCode: "+keyCode);
            if(keyCode == 113){
                break;
            }
        }
        System.out.println("종료");

         */

        // 3. Scanner 클래스 (2개 이상의 키가 조합된 한글 읽기 가능)
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine(); // 엔터키 이전까지 입력된 문자열을 읽음

        while(true){
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")){
                break;
            }
        }
        System.out.println("종료");
    }
}
