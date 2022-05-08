package com.company;

import java.util.Scanner;

public class MyThread extends Thread {

    private int delay;

    public MyThread(int delay) {
        this.delay = delay;
    }

    public void run() {
        while (true) {
            System.out.println();
            System.out.print("Введіть число: ");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            fiboPrint(i);
        }
    }

    private void fiboPrint(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2;
        System.out.print(f0 + " " + f1 + " ");
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; ++i) {
            f2 = f0 + f1;
            System.out.print(f2 + " ");
            f0 = f1;
            f1 = f2;
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
