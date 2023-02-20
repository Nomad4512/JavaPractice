package com.java;

public class _9Array {
    // 배열
    public static void main(String[] args) {

        // 1. 배열 선언
        int[] intArray;
        double doubleArray[];

        // 2. 배열 생성
        String[] names = {"홍길동","김철수","김구"};

        for(int i=0;i<names.length;i++){
            if(i!=names.length-1) {
                System.out.print(names[i] + ", ");
            }else {
                System.out.print(names[i]);
            }
        }System.out.println();

        // 3. 다차원 배열
            // 직사각형
            int[][] scores = new int[2][3];
            System.out.println(scores.length);
            System.out.println(scores[0].length);
            System.out.println(scores[1].length);

            // 계단형 - 배열의 정확한 길이를 알고 인덱스를 사용하지않으면 ArrayIndexOutOfBoundsException 발생
            int[][] scores2 = new int[2][];
            scores2[0] = new int[2];
            scores2[1] = new int[3];
            System.out.println(scores2.length);
            System.out.println(scores2[0].length);
            System.out.println(scores2[1].length);

        // 4. 배열 복사
            int[] oldIntArray = {1,2,3};
            int[] newIntArray = new int[5];

            for (int i=0;i<oldIntArray.length;i++){
                newIntArray[i] = oldIntArray[i];
            }

            System.out.println("for문으로 배열 복사");
            for (int i=0;i<newIntArray.length;i++){
                if(i!= newIntArray.length-1) {
                    System.out.print(newIntArray[i] + ", ");
                }else {
                    System.out.print(newIntArray[i]);
                }
            }System.out.println("");

            System.out.println("System.arraycopy()로 배열 복사");
            int[] newIntArray2 = new int[5];
            System.arraycopy(oldIntArray,0,newIntArray2,0,oldIntArray.length);
        for (int i=0;i<newIntArray2.length;i++){
            if(i!= newIntArray2.length-1) {
                System.out.print(newIntArray2[i] + ", ");
            }else {
                System.out.print(newIntArray2[i]);
            }
        }System.out.println("");

        int[] scores3 = {95,71,84,93,87};
        int sum=0;

        for (int score3:scores3){
            sum = sum+score3;
        }
        System.out.print(scores3[0]+", ");
        System.out.print(scores3[1]+", ");
        System.out.print(scores3[2]+", ");
        System.out.print(scores3[3]+", ");
        System.out.println(scores3[4]);

        System.out.println("점수 총합 = "+sum);

        double avg = (double) sum / scores3.length;
        System.out.println("점수 평균 = "+avg);
    }
}
