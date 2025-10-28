/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr4_belyaevsr.Task1;

/**
 *
 * @author STUDENT 1
 */
public class MyThread extends Thread{
     @Override
     public void run() {
        System.out.println("Поток " + getName() + " начал выполнение.");
    }

    

}
