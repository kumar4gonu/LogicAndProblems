package com.functionInterface;

@FunctionalInterface
public interface InterfaceC {
    public void sum();
    default public void show(){
        System.out.println("Show form Interface C called........");
    }
}
