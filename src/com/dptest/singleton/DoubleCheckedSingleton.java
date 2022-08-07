/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dptest.singleton;

/**
 *
 * @author admin
 */
public class DoubleCheckedSingleton {
    private DoubleCheckedSingleton(){
    
    }
    private static DoubleCheckedSingleton INSTANCE;
    public static DoubleCheckedSingleton getInstance(){
        System.out.println(Thread.currentThread().getName() + " inside getInstance()");
        if(INSTANCE == null){
            System.out.println(Thread.currentThread().getName() + " inside first null check");
            synchronized(DoubleCheckedSingleton.class){
                System.out.println(Thread.currentThread().getName() + " inside synchronized block");
                if(INSTANCE == null){
                    System.out.println(Thread.currentThread().getName() + " inside second null check");
                    INSTANCE = new DoubleCheckedSingleton();
                    System.out.println(Thread.currentThread().getName() + " created INSTANCE");
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " out of getInstance() method");
        return INSTANCE;
    }
}
