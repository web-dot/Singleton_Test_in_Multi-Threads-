/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dptest.singleton;

/**
 *
 * @author admin
 * In the SyncSingleton the instance is created in a synchronized block in
 * getInstance() method to ensure that only one thread is allowed at a time
 * inside the synchronized block, and once one thread instantiates the class
 * the null check will fail and the second thread will not be able to create 
 * a second instance of the class.
 * 
 * Testing the class using multiple threads will demonstrate if it is correct.
 */
public class SyncSingleton {
    private SyncSingleton(){
    
    }
    private static SyncSingleton INSTANCE;
    public static SyncSingleton getInstance(){
        System.out.println(Thread.currentThread().getName() + " inside getInstance()");
        if(INSTANCE == null){
            System.out.println(Thread.currentThread().getName() + " inside null check");
            synchronized(SyncSingleton.class){
                System.out.println(Thread.currentThread().getName() + " inside synchronized block");
                INSTANCE = new SyncSingleton();
            }
        }
        return INSTANCE;
    } 
    
}






