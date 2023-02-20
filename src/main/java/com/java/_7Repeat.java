package com.java;

public class _7Repeat {
    // 반복문 : for, while, do-while

    public static void main(String[] args) {

        // 1. for문
        int sum = 0;
        for(int i=1;i<10;i++){
            sum = sum+i;
        }
        System.out.println("1~10의 합:"+sum);

        // 1-1. 세로 구구단
        for(int i=2;i<10;i++){
            System.out.println("---"+i+"단---");
            for (int j=1;j<9;j++){
                System.out.print(i+" x "+j+" = ");
                System.out.printf("%2d\n",i*j);
            }
        }

        System.out.println("////////////////////////////////////////");

        // 1-2 가로 구구단
        for (int i=2;i<10;i++){
            System.out.println("---"+i+"단---");
            for (int j=1;j<10;j++){
                System.out.print(i+" x "+j+" = ");
                System.out.printf("%2d\t",i*j);
            }System.out.println("");
        }

        System.out.println("////////////////////////////////////////");
        // 2. while문

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int sum2=0; int j=1;
        while (j<=100){
            sum2 += j;
            j++;

        }System.out.println("1 ~ "+(j-1)+" 합 : "+sum2);

        System.out.println("////////////////////////////////////////");
        // 3. do-while문

        // 4. for문 예제 1~100 까지의 3의 배수 총합
        int sum3 = 0;
        for(i=0;i<100;i++){
            if(i%3==0){
                sum3 += i;
            }
        }System.out.println("3의배수 총합 : "+sum3);

        for(int a=0;a<4;a++){
            for (j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("");

        for(int a=1;a<5;a++){
            for (j=4;j>0;j--){
                if(a<j) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }System.out.println();
        }

    }
}
