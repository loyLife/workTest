package org.loy.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private final Lock lock = new ReentrantLock();
    static int value;
    public  void addOne(){
        try{
            lock.lock();
            value ++;
        }catch (Exception e){
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        LockTest test = new LockTest();
        for(int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000000;i++){
                        test.addOne();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }
}
