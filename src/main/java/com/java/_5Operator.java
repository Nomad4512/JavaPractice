package com.java;

public class _5Operator {
    // 연산자와 연산식

    public static void main(String[] args) {
        // 1. 삼항연산자
        int score = 95;
        char grade = (score>90) ? 'A':'B';
        System.out.println(grade);

        score = 78;
        grade = (score>90) ? 'A': (score>80) ? 'B':'C';
        System.out.println(grade);

    }
}
