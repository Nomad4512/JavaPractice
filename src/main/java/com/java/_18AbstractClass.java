package com.java;

public class _18AbstractClass {
    // 추상클래스

        // 1. 추상클래스의 목적
        // 공통된 필드와 메소드의 이름을 통일. 실체 클래스 작성시 시간절약

    public abstract class Animal{
        public abstract void sound();
        public String kind;
        public void breathe(){
            System.out.println("숨을 쉽니다.");
        }
    }

    public class Dog extends Animal {
        public Dog() {
            this.kind = "표유류";
        }

        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    }
    public class Cat extends Animal{
        public Cat(){
            this.kind = "표유류";
        }
        @Override
        public void sound(){
            System.out.println("야옹");
        }
    }


}
