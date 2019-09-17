package org.loy.test;

import java.util.concurrent.CountDownLatch;

public class HttpTest1 {
    private static CountDownLatch countDownLatch = new CountDownLatch(100);
    public static void main(String[] args) {

        for(int i =0 ;i<100;i++){
            new Thread(new Loy()).start();
            countDownLatch.countDown();
        }
    }

    static class Loy implements Runnable{

        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
