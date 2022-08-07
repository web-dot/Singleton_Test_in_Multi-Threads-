/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dptest.singleton;

/**
 *
 * @author admin
 * The problem with the Double-Checked Locking singleton can be solved
 * using the volatile keyword.
 * 
 * The volatile reserved word ensures that different threads correctly handle 
 * concurrent access to single instance of singleton.
 */
public class VolatileSingleton {
    private VolatileSingleton(){
    
    }
    private static volatile VolatileSingleton INSTANCE;
    public static VolatileSingleton getInstance(){
        System.out.println(Thread.currentThread().getName() + " inside getInstance()");
        if(INSTANCE == null){
            System.out.println(Thread.currentThread().getName() + " inside first null check");
            synchronized(VolatileSingleton.class){
                System.out.println(Thread.currentThread().getName() + " inside synchronized block");
                if(INSTANCE == null){
                    System.out.println(Thread.currentThread().getName() + " inside second null check");
                    INSTANCE = new VolatileSingleton();
                    System.out.println(Thread.currentThread().getName() + " created INSTANCE");
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " out of getInstance() method");
        return INSTANCE;
    }
}
