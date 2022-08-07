/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dptest.singleton;

/**
 *
 * @author admin
 * 
 */
public class TSafeSingleton {
   private TSafeSingleton(){
       
   } 
   private static TSafeSingleton INSTANCE;
   public static TSafeSingleton getInstance(){
       System.out.println(Thread.currentThread().getName() + " inside getInstance()");
       if(INSTANCE == null){
           System.out.println(Thread.currentThread().getName() + " inside null check");
           INSTANCE = new TSafeSingleton();
           System.out.println(Thread.currentThread().getName() + " created instance");
       }
       return INSTANCE;
   }
}
