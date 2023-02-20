package com.java;

public class _6IfSwitch {
    // 조건문: if, switch
    public static void main(String[] args) {

        int score = 9;
        String grade;
        if(score >= 90){
            grade = "A";
        }else if(score>=80) {
            grade = "B";
        }else {
            grade = "C";
        }
        System.out.println(grade);

        // 주사위 던지기 놀이
        int num = (int) (Math.random() * 6) + 1;

        if (num==1){
            System.out.println("1번이 나왔습니다.");
        }else if(num==2){
            System.out.println("2번이 나왔습니다.");
        }else if(num==3){
            System.out.println("3번이 나왔습니다.");
        }else if(num==4){
            System.out.println("4번이 나왔습니다.");
        }else if(num==5){
            System.out.println("5번이 나왔습니다.");
        }else {
            System.out.println("6번이 나왔습니다.");
        }

        switch (num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
                break;

        }
    }
}
