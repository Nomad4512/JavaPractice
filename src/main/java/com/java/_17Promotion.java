package com.java;

public class _17Promotion {


    // 타입변환과 다형성
    public static void main(String[] args) {

        class Parent {
            void method1(){
                System.out.println("P-M1");
            }
            void method2(){
                System.out.println("P-M2");
            }
            String field1;
        }

        class Child extends Parent{
            @Override
            void method2(){
                System.out.println("C-M2");
            }
            void method3(){
                System.out.println("C-M3");
            }
            String field2;
        }

        Child child = new Child();
        Parent parent = child; // Parent 타입으로 변환

        parent.method1();
        parent.method2(); // Child클래스의 method2() 호출
        // parent.method3(); 호출불가

        System.out.println("////////////////");
        // 강제 타입변환

        Parent parent2 = new Child();
        parent2.field1 = "data1";
        parent2.method1();
        parent2.method2();

        /* 불가능
        parent.field2 = "data2";
        parent.method3();
         */

        Child child2 = (Child) parent2;
                child2.field2 = "yyy";
                child2.method3();


    }
}
