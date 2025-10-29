/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr4_belyaevsr.Task3;

/**
 *
 * @author STUDENT 1
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(1000); // Имитация работы
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1 has finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(2000); // Имитация работы
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2 has finished");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Ожидаем завершения thread1
            thread2.join(); // Ожидаем завершения thread2
        } catch (InterruptedException e) {
        }

        System.out.println("Both threads have finished. Main thread resumes.");
    }
}


