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
public class RunnableClass implements Runnable {

    @Override
    public void run() {
        TSafeSingleton tsing = null;
        tsing.getInstance();
    }
    
}
