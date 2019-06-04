package boot;

import static java.lang.Thread.sleep;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        sleep(100000);
                        System.out.println("111");
                    } catch (InterruptedException e) {
                        System.out.println("222");
                        Thread.currentThread().interrupt();//重新设置中断位，否则线程不能退出
                    } finally {
                        System.out.println("444");
                    }
                }
            }
        };
        Thread t = new Thread(r1);
        sleep(1000);
        t.start();
        t.interrupt();
    }
}
