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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // Запуск нового потока
        myThread.start();

        System.out.println("Основной поток продолжает выполнение.");
    }
}
