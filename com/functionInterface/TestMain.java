package com.functionInterface;

public class TestMain {
    public static void main(String[] args) {
    TestC testc = new TestC();

    TestA testa = new TestC();

    testc.show();

    }
    public void show(){
        System.out.println("Showed called from main class.");
    }
}
