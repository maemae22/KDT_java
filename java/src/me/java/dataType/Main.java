package me.java.dataType;

public class Main {
    public static void main(String[] args) {
        // 리터럴 (literal) : 데이터 수
        int a = 3;

        // 자료형 (datatype)
        // 원시 자료형 (primitive type) : 스택 공간
        // int(4), float(4), double(8), char(2)
        // 1byte = 8bit
        // ________
        // 참조형 (reference type) : 힙 공간
        // String

        // 작은 발은 큰 신발에 들어갈 수 있음
        // 작은 리터럴은 큰 변수공간에는 들어갈 수 있음
        byte b = 127; // type casting (명시적 형변환)
        short s = 10;
        int i = 10;  // 정수의 기본 단위
        // i = 10;
        long l = 10;  // promotion (자동 형변환)
        float f = 3.14f;
        double d = 3.14;  // 실수의 기본 단위

        // 10
        // 3.14

        byte var1 = 125;
        int var2 = 125;

        for (int k = 0; k < 5; k++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
    }

}