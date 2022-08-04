package cc.rcbb.test.java.util.concurrent.locks;

import java.util.concurrent.locks.LockSupport;

class MyThread extends Thread {
    private Object object;

    public MyThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("before unpark");
        System.out.println("1 "+LockSupport.getBlocker((Thread) object));
        // 释放许可
        LockSupport.unpark((Thread) object);
        System.out.println("2 "+LockSupport.getBlocker((Thread) object));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after unpark");
    }
}

public class ParkAndUnparkDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(Thread.currentThread());
        myThread.start();
        try {
            // 主线程睡眠3s
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("before park");
        // 获取许可
        System.out.println("3 "+LockSupport.getBlocker(Thread.currentThread()));

        LockSupport.park("ParkAndUnparkDemo");
        System.out.println("4 "+LockSupport.getBlocker(Thread.currentThread()));

        System.out.println("after park");
    }
}