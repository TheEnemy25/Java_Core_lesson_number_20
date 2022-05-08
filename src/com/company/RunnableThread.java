package com.company;

import java.util.Scanner;

public class RunnableThread implements Runnable {

    private int delay;
    private Thread thread;

    public RunnableThread(int delay) {
        this.delay = delay;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println();
            System.out.println("Введіть число: ");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            fiboPrint(i, 0, 1);
        }
    }

    private void fiboPrint(int f0, int f1, int f2) {
        if (f0 > 0) {
            fiboPrint(f0 - 1, f2, f1 + f2);
            System.out.print(f1 + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
