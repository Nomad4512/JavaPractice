package com.java;

public class _8ReferenceType {
    // 참조타입과 참조 변수
    public static void main(String[] args) {

        // 1. 참조변수의 ==,!= 연산
        String name1 = "오픈";
        String name2 = "오픈";
        String name3 = new String("오픈");

        if(name1==name2){
            System.out.println("1=2");
        }else {
            System.out.println("1!=2");
        }

        if(name1==name3){
            System.out.println("1==3");
        }else {
            System.out.println("1!=3");
        }

        if(name1.equals(name3)){
            System.out.println("1 equals 3");
        }else {
            System.out.println("1 not equals 3");
        }

    }
}
