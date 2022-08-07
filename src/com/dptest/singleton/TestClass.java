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
public class TestClass {
    public static void main(String[] args) throws Exception{
        Thread T1 = new Thread(new RunnableClass());
        Thread T2 = new Thread(new RunnableClass());
        
        T1.setName("T1");
        T2.setName("T2");
        
        T1.start();
        T1.sleep(100);
        T2.start();
    }
}
