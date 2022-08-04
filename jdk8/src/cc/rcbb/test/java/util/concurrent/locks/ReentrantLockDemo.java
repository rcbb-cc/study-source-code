package cc.rcbb.test.java.util.concurrent.locks;

/**
 * <p>
 * ReentrantLockDemo
 * </p>
 *
 * @author rcbb.cc
 * @date 2021/9/7
 */
class Consumer {
    private Depot depot;

    public Consumer(Depot depot) {
        this.depot = depot;
    }

    public void consume(int no) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                depot.consume(no);
            }
        }, no + " consume thread").start();
    }
}

class Producer {
    private Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }

    public void produce(int no) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                depot.produce(no);
            }
        }, no + " produce thread").start();
    }

}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        Depot depot = new Depot(500);
        new Producer(depot).produce(500);
        new Producer(depot).produce(200);
        new Consumer(depot).consume(500);
        new Consumer(depot).consume(200);

    }
}
